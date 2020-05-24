package bulider;

import javax.swing.*;
import java.awt.*;


class EconHouseBuilder extends HouseBuilder {
    public static final String SMALL_AREA = "180 sq meters";
    public static final String BIG_AREA = "210 sq meters";
    public static final String LESS_BEDROOM = "2";
    public static final String MORE_BEDROOM = "3";
    public static final String LESS_BATHROOM = "1";
    public static final String MORE_BATHROOM = "2";
    public static final String SMALL_GARAGE = "1-car garage";
    public static final String BIG_GARAGE = "2-car garage";
    public static final String ECONOMY_TYPE = "Economy-type house";

    public EconHouseBuilder() {
        area = null;
        bedroom = null;
        bathroom = null;
        garage = null;
        garden = null;
        swimmingPool = null;
    }

    public void addUIComponents() {
        houseGUI = new JPanel();
        houseGUI.setLayout(new GridLayout(4, 3));
        JLabel label1 = new JLabel("Area:");
        JLabel label2 = new JLabel("Bed room number:");
        JLabel label3 = new JLabel("Bathroom number:");
        JLabel label4 = new JLabel("Garage type:");

        //Add code here
        JRadioButton areaBtn1 = new JRadioButton(SMALL_AREA);
        JRadioButton areaBtn2 = new JRadioButton(BIG_AREA);
        JRadioButton bedroomBtn1 = new JRadioButton(LESS_BEDROOM);
        JRadioButton bedroomBtn2 = new JRadioButton(MORE_BEDROOM);
        JRadioButton bathroomBtn1 = new JRadioButton(LESS_BATHROOM);
        JRadioButton bathroomBtn2 = new JRadioButton(MORE_BATHROOM);
        JRadioButton grageBtn1 = new JRadioButton(SMALL_GARAGE);
        JRadioButton grageBtn2 = new JRadioButton(BIG_GARAGE);

        ButtonGroup areaGroup = new ButtonGroup();
        ButtonGroup bedroomGroup = new ButtonGroup();
        ButtonGroup bathroomGroup = new ButtonGroup();
        ButtonGroup garageGroup = new ButtonGroup();
        ButtonGroup gardenGroup = new ButtonGroup();
        ButtonGroup swPoolGroup = new ButtonGroup();
        areaGroup.add(areaBtn1);
        areaGroup.add(areaBtn2);
        bedroomGroup.add(bedroomBtn1);
        bedroomGroup.add(bedroomBtn2);
        bathroomGroup.add(bathroomBtn1);
        bathroomGroup.add(bathroomBtn2);
        garageGroup.add(grageBtn1);
        garageGroup.add(grageBtn2);
        houseGUI.add(label1);
        houseGUI.add(areaBtn1);
        houseGUI.add(areaBtn2);
        houseGUI.add(label2);
        houseGUI.add(bedroomBtn1);
        houseGUI.add(bedroomBtn2);
        houseGUI.add(label3);
        houseGUI.add(bathroomBtn1);
        houseGUI.add(bathroomBtn2);
        houseGUI.add(label4);
        houseGUI.add(grageBtn1);
        houseGUI.add(grageBtn2);

        areaBtn1.addActionListener(new AreaListener());
        areaBtn2.addActionListener(new AreaListener());
        bedroomBtn1.addActionListener(new BedroomListener());
        bedroomBtn2.addActionListener(new BedroomListener());
        bathroomBtn1.addActionListener(new BathroomListener());
        bathroomBtn2.addActionListener(new BathroomListener());
        grageBtn1.addActionListener(new GarageListener());
        grageBtn2.addActionListener(new GarageListener());

    }

    /* Build up a whole object incrementally */
    public void buildType() {
        house.setType(ECONOMY_TYPE);
    }

    public void buildArea() {
        // Add code here
        house.setArea(area);
    }

    public void buildBedroom() {
        // Add code here
        house.setBedroom(bedroom);
    }

    public void buildBathroom() {
        // Add code here
        house.setBathroom(bathroom);
    }

    public void buildGarage() {
        // Add code here
        house.setGarage(garage);

    }

    public void buildGarden() {
        // Add code here
        house.setGarden(garden);
    }

    public void buildSwimmingpool() {
        // Add code here
        house.setSwimmingPool(swimmingPool);
    }

    //This method returns user chosen requests
    //as a string to be displayed on screen
    public String getUserRequest() {
        String usrRequest;
        if ((area == null) || (bedroom == null) || (bathroom == null) || (garage == null)) {
            usrRequest = "Incomplete items";
        } else {
            usrRequest = ECONOMY_TYPE
                    + "\nArea =" + area
                    + "\nBedroom number= " + bedroom
                    + "\nBathroom number = " + bathroom
                    + "\nGarage type = " + garage;

        }
        return usrRequest;
    }
}// end class

