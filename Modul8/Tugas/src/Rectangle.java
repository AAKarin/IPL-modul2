public class Rectangle extends Shape {

    private Point topLeft;
    private int width;
    private int height;

    public Rectangle(Point topLeft, int width, int height) {
        this.topLeft = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(DrawingContext context) {
        System.out.println("Drawing rectangle at (" + topLeft.getX() + ", " + topLeft.getY() + "), width=" + width + ", height=" + height);
    }

    @Override
    public void erase(DrawingContext context) {
        System.out.println("Erasing rectangle at (" + topLeft.getX() + ", " + topLeft.getY() + ")");
    }

    @Override
    public void move(int dx, int dy) {
        topLeft.setX(topLeft.getX() + dx);
        topLeft.setY(topLeft.getY() + dy);
    }

    @Override
    public void resize(double factor) {
        width = (int) (width * factor);
        height = (int) (height * factor);
    }
}