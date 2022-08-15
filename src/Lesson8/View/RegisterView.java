package Lesson8.View;

import Lesson8.Controllers.RegistrationController;
import Lesson8.Exceptions.RegistrationException;
import Lesson8.Model.User;

import java.util.Scanner;

public class RegisterView {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void run() {
        while (true){
            System.out.println("Registration started");
            System.out.println("Enter login");
            String login = SCANNER.nextLine();

            System.out.println("Enter password");
            String password = SCANNER.nextLine();

            System.out.println("Confirm ur password");
            String password2 = SCANNER.nextLine();

            RegistrationController controller = new RegistrationController();
            try {
               User user =  controller.register(login, password, password2);
                System.out.println("User: " + user.getLogin() + " has created " );
//               MainMenu.run(user);
               break;
            } catch (RegistrationException e) {
                System.out.println("ERROR: " + e.getMessage());
                System.out.println("Do you want to  try again?");
                System.out.println("1 - yes");
                System.out.println("2 - no");

                int answer = SCANNER.nextInt();
                if(answer == 1){

                } else if (answer == 2) {
                    break;
                } else {
                    throw new IllegalArgumentException("Unsupported  operation: " + answer);
                }

            }
        }
    }
}
