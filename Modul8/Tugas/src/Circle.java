public class Circle extends Shape {

    private float radius;
    private Point center;

    public Circle() {
        this(0, new Point(0, 0));
    }

    public Circle(float radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public double area(float radius) {
        return Math.PI * radius * radius;
    }

    public double area() {
        return area(this.radius);
    }

    public double circum() {
        return 2 * Math.PI * radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing circle with radius " + radius + " at (" + center.getX() + ", " + center.getY() + ")");
    }

    @Override
    public void erase(DrawingContext context) {
        System.out.println("Erasing circle at (" + center.getX() + ", " + center.getY() + ")");
    }

    @Override
    public void move(int dx, int dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }
}