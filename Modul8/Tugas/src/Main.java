public class Main {
    public static void main(String[] args) {
        DrawingContext context = new DrawingContext();

        ConsoleWindow cw = new ConsoleWindow("Console");
        DialogBox db = new DialogBox("Save Dialog");
        DataController dc = new DataController();
        db.setController(dc);

        Frame frame = new Frame(cw);
        frame.getMainWindow().open();
        frame.getMainWindow().display();

        Circle c = new Circle(10f, new Point(50, 50));
        c.draw(context);
        System.out.println("Circle area = " + c.area());
        System.out.println("Circle circum = " + c.circum());

        Rectangle r = new Rectangle(new Point(10, 10), 100, 50);
        r.draw(context);
        Point[] pts = {new Point(0, 0), new Point(10, 0), new Point(10, 10), new Point(0, 10)};
        Polygon p = new Polygon(pts);
        p.draw(context);
    }
}