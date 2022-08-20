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
               break;
            } catch (RegistrationException e) {
                System.out.println("ERROR: " + e.getMessage());
                SimpleAskView simpleAskView = new SimpleAskView("Do you want to try again?\n y/n");
                SimpleAskView.run();
                if(simpleAskView.LIST.contains(SimpleAskView.answer)){

                } else if (simpleAskView.LIST2.contains(SimpleAskView.answer)) {
                    break;

                }

                 else {
                    throw new IllegalArgumentException("Unsupported  operation: " );//+ //answer);
                }

            }
        }
    }
}
