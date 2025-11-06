public class Hexagon extends Shape {
    private double sideLength; //all 6 sides are equal

    public Hexagon(double x, double y, double sideLength) {
        super(x, y);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }
}
