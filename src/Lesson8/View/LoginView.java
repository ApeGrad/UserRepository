package Lesson8.View;

//import Lesson8.Controllers.LoginController;

import Lesson8.Controllers.LoginController;

import java.util.Scanner;

public class LoginView {
    private final static Scanner SCANNER = new Scanner(System.in);
    static LoginController loginController = new LoginController();
    public static void run() {
        while (true) {
            System.out.println("Login started");
            System.out.println("Enter ur login");
            String login = SCANNER.nextLine();



            System.out.println("Enter ur password");
            String password = SCANNER.nextLine();

            if(loginController.isAuthorisationTrue(login,password)){
                System.out.println("Login successful");
                break;
            }



        }

    }
}
