import java.awt.*;

public abstract class Shape  {
  protected Turtle turtle;
  protected Point point; //x and y

    public Shape(Turtle turtle, Point point) {
        this.turtle = turtle;
        this.point = point;
    }

    public Turtle getTurtle() {
        return turtle;
    }

    public void setTurtle(Turtle turtle) {
        this.turtle = turtle;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
    public abstract void paint();
}
