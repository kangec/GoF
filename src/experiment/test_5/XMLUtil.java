package experiment.test_5;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLUtil {
    public static List<Object> getBean() {
        List<Object> list = new ArrayList<>();
        try {
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File(XMLUtil.class.getResource("config.xml").toURI()));

            NodeList nl = doc.getElementsByTagName("className");
            for (int i = 0; i < nl.getLength(); i++) {
                Node classNode = nl.item(i).getFirstChild();
                String cName = classNode.getNodeValue();
                Class clzz = Class.forName(cName);
                Object obj = clzz.newInstance();
                list.add(obj);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
