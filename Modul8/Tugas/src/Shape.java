public abstract class Shape {

    public abstract void draw(DrawingContext context);

    public abstract void erase(DrawingContext context);

    public abstract void move(int dx, int dy);

    public abstract void resize(double factor);
}