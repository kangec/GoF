package command;


class WindowOpenCmd implements Command {
    private final GWindow window;

    public WindowOpenCmd(GWindow window) {
        this.window = window;
    }

    public void execute() {
        window.open();
    }
}
