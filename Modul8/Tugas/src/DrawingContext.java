public class DrawingContext {
    public void setPoint(Point p) {
        System.out.println("Setting drawing point to: (" + p.getX() + ", " + p.getY() + ")");
    }
    public void clearScreen() {
        System.out.println("Screen cleared.");
    }
    public int getVerticalSize() {
        return 1080;
    }
    public int getHorizontalSize() {
        return 1920;
    }
}