import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle(Turtle turtle, Point point, double radius) {
        super(turtle, point);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void paint(){
        turtle.goTo(point.x,point.y); //center of circle
        int steps = 36;
        double stepLength = 2 * Math.PI * radius / steps;
        double angle = 360.0 / steps;

        for(int i = 0; i< steps; i++) {
            turtle.forward(stepLength);
            turtle.turnRight(angle);
        }
    }
}
