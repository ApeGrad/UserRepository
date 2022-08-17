package Lesson8.View;

import java.util.Scanner;

public class StartMenu   {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void run(){
        System.out.println("Hello!");
        System.out.println("Do you have an account?");
        System.out.println("1 - yes, 2 - no");
        boolean isCorrectAnswer = SCANNER.hasNextInt();
        while(!isCorrectAnswer){
            SCANNER.nextLine();
            System.out.println("Wrong action");
            System.out.println("1 - yes, 2 - no");
            isCorrectAnswer = SCANNER.hasNextInt();
        }
        boolean variable = true;
        while(variable) {
            System.out.println("1 - login, 2 - register, 3 - exit");
            int answer = SCANNER.nextInt();
            switch (answer) {
                case 1:
                    LoginView.run();
                    break;
                case 2:
                    RegisterView.run();
                    break;
                case 3:
                    variable = false;
                    break;
            }
        }




    }
}
