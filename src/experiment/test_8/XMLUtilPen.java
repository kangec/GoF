package experiment.test_8;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class XMLUtilPen {
    public static Object getBean(String args) {
        try {
            //�����ĵ�����
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(Client.class.getResourceAsStream("configPen.xml"));
            NodeList nl = null;
            Node classNode = null;
            String cName = null;
            nl = doc.getElementsByTagName("className");

            if (args.equals("color")) {
                classNode = nl.item(0).getFirstChild();

            } else if (args.equals("pen")) {
                classNode = nl.item(1).getFirstChild();
            }

            cName = classNode.getNodeValue();
            Class c = Class.forName(cName);
            Object obj = c.newInstance();
            return obj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
