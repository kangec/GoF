package command;

class FanOnCmd implements Command {
    private final GFan fan;

    public FanOnCmd(GFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.startRotate();
    }
}
