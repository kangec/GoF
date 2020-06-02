package command;


class FanOffCmd implements Command {
    private final GFan fan;

    public FanOffCmd(GFan fan) {
        this.fan = fan;
    }

    public void execute() {
        fan.stopRotate();
    }
}


