import java.awt.*;

public class Square extends Shape {
    private int x;
    private int y;
    private double sideLength;

    public Square(Turtle turtle, Point point, double sideLength) {
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
        turtle.goTo(point.x,point.y);
        for(int i = 0;i < 4; i++) {
            turtle.forward(sideLength);
            turtle.turnRight(90);
        }
    }
}
