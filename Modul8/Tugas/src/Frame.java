public class Frame {
    private Window mainWindow;

    public Frame(Window mainWindow) {
        this.mainWindow = mainWindow;
    }

    public Window getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(Window mainWindow) {
        this.mainWindow = mainWindow;
    }
}