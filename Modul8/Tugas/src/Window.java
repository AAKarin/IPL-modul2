public class Window {
    private String title;

    public Window() {
    }

    public Window(String title) {
        this.title = title;
    }

    public void open() {
        System.out.println("Window \"" + title + "\" opened.");
    }

    public void close() {
        System.out.println("Window \"" + title + "\" closed.");
    }

    public void move(int x, int y) {
        System.out.println("Window \"" + title + "\" moved to (" + x + ", " + y + ").");
    }

    public void display() {
        System.out.println("Displaying window \"" + title + "\".");
    }

    public void handleEvent(Event e) {
        System.out.println("Window \"" + title + "\" handling event: " + e);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}