package bulider;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


abstract class HouseBuilder {
    protected House house;
    protected JPanel houseGUI;
    protected String area;
    protected String bedroom;
    protected String bathroom;
    protected String garage;
    protected String garden;
    protected String swimmingPool;

    public House getHouse() {
        return house;
    }

    public void createNewHouseProduct() {
        house = new House();
    }

    public abstract void buildType();

    public abstract void buildArea();

    public abstract void buildBedroom();

    public abstract void buildBathroom();

    public abstract void buildGarage();

    public abstract void buildGarden();

    public abstract void buildSwimmingpool();

    public JPanel getSearchUI() {
        return houseGUI;
    }

    public abstract String getUserRequest();

    public abstract void addUIComponents();

    //This listener sets-up area
    class AreaListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            area = e.getActionCommand();
        }
    }

    //This listener sets-up bedroom number
    class BedroomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedroom = e.getActionCommand();
        }
    }

    //This listener sets-up bathroom number
    class BathroomListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bathroom = e.getActionCommand();
        }
    }

    //This listener sets-up garage number
    class GarageListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            garage = e.getActionCommand();
        }
    }

    //This listener sets-up garden area
    class GardenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            garden = e.getActionCommand();
        }
    }

    //This listener sets-up swimming pool size
    class SwPoolListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            swimmingPool = e.getActionCommand();
        }
    }
}
