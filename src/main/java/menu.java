public class menu {

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
                case 1, 2:
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

    public
}
