package Visitor;

/*=========================================*/
/* This is the interface for the visitors  */
/* in the class diagram of the visitor     */
/* design pattern                          */
/*=========================================*/


public interface Visitor {

    void visitComputerCase(ComputerCase e);

    void visitPowerSupply(PowerSupply e);

    void visitMotherboard(Motherboard e);

    void visitMicroprocessor(Microprocessor e);

    void visitMemory(Memory e);

    void visitDriveController(DriveController e);

    void visitHardDiskDrive(HardDiskDrive e);

    void visitCDDrive(CDDrive e);

    void visitDVDDevice(DVDDevice e);

    void visitMonitor(Monitor e);

    void visitKeyboard(Keyboard e);

    void visitMouse(Mouse e);

    void visitFan(Fan e);

    void visitVideoCard(VideoCard e);
}

