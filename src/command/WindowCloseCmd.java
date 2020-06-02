package command;


class WindowCloseCmd implements Command {
    private final GWindow window;

    public WindowCloseCmd(GWindow window) {
        this.window = window;
    }

    public void execute() {
        window.close();
    }
}


