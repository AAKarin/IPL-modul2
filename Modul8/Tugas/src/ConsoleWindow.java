public class ConsoleWindow extends Window {

    public ConsoleWindow() {
    }

    public ConsoleWindow(String title) {
        super(title);
    }

    @Override
    public void display() {
        System.out.println("[ConsoleWindow] display: " + getTitle());
    }
}