import java.awt.*;

public class Hexagon extends Shape {
    private double sideLength; //all 6 sides are equal

    public Hexagon(Turtle turtle, Point point, double sideLength) {
        super(turtle, point);
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public void paint(){
        turtle.goTo(point.x, point.y);
        for(int i = 0; i < 6;i++) {
            turtle.forward(sideLength);
            turtle.turnRight(60); //360/6 = 60 degrees
        }
    }
}
