public class DialogBox extends Window {
    private DataController controller;

    public DialogBox() {
    }

    public DialogBox(String title) {
        super(title);
    }

    public DataController getController() {
        return controller;
    }

    public void setController(DataController controller)
    {
        this.controller = controller;
    }

    @Override
    public void display() {
        System.out.println("[DialogBox] display: " + getTitle());
    }
}