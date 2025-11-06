import java.awt.*;

public class Triangle extends Shape{
    private double side;

    public Triangle(Turtle turtle, Point point, double side) {
        super(turtle, point);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void paint(){
        turtle.goTo(point.x,point.y);
        for(int i = 0; i<3;i++){
            turtle.forward(side);
            turtle.turnRight(120);
        }
    }
}
