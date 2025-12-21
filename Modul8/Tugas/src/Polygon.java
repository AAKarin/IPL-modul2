public class Polygon extends Shape {

    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing polygon with " + points.length + " points.");
    }

    @Override
    public void erase(DrawingContext context) {
        System.out.println("Erasing polygon with " + points.length + " points.");
    }

    @Override
    public void move(int dx, int dy) {
        for (Point p : points) {
            p.setX(p.getX() + dx);
            p.setY(p.getY() + dy);
        }
    }

    @Override
    public void resize(double factor) {
        Point origin = points[0];
        for (int i = 1; i < points.length; i++) {
            int dx = points[i].getX() - origin.getX();
            int dy = points[i].getY() - origin.getY();
            points[i].setX(origin.getX() + (int) (dx * factor));
            points[i].setY(origin.getY() + (int) (dy * factor));
        }
    }
}