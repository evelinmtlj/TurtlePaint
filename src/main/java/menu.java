import java.awt.*;

public class menu {
    private World world;

    public void Menu(){
        this.world = new World();
    }

    public void display(){
        String mainMenu = """
                                *************************************
                                *     Welcome to the Main Screen    *
                                **************************************
                              1 - Add Shape
                              2 - Save image
                              3 - Exit
             
                """;

        while(true) {
            System.out.println(mainMenu);
            int choice = ConsoleHelper.promptForInt("Enter choice");

            switch (choice) {
                case 1:
                    addShape();
                    break;
                  case 2:
                    //
                    break;
                case 3:
                    System.out.println("Goodbye........");
                    return;

                default:
                    System.out.println("Invalid choice please try again");
                    break;
            }
        }
    }

    public static void addShape(){
        Turtle turtle = new Turtle(new World());

        int shapeOption = ConsoleHelper.promptForInt("Choose a shape: 1) Square, 2) Circle, 3) Triangle, 4) Hexagon");
        double sideLength;
        int x = 0,y = 0;

        switch(shapeOption) {
            case 1:
                sideLength = ConsoleHelper.promptForDouble("Enter the side length");
                break;
            case 2:
                sideLength = ConsoleHelper.promptForDouble("Enter the radius");
                break;
            case 3:
                sideLength = ConsoleHelper.promptForDouble("Enter the base size ");
                break;
            case 4:
                sideLength = ConsoleHelper.promptForDouble("Enter the side length ");
                break;

                default:
                System.out.println("Please enter 1,2,3,4");
                return;
        }
        Point point = new Point(x,y);

        switch (shapeOption) {
            case 1:
                Square square = new Square(turtle,point,sideLength);
                square.paint();
                break;
            case 2:
                Circle circle = new Circle(turtle,point,sideLength);
                circle.paint();
                break;
            case 3:
                Triangle triangle = new Triangle(turtle,point,sideLength);
                triangle.paint();
                break;
            case 4:
                Hexagon hexagon = new Hexagon(turtle,point,sideLength);
                hexagon.paint();
        }

    }


}
