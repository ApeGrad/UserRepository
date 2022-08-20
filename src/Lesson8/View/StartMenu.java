package Lesson8.View;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StartMenu {
    private final static Scanner SCANNER = new Scanner(System.in);

    public static void run() {
        SimpleAskView simpleAskView = new SimpleAskView("Hello!\nDo you have an account?\nYes/no?");
        SimpleAskView.run();
        if (simpleAskView.LIST2.contains(SimpleAskView.answer)) {
            RegisterView.run();

        } else if (simpleAskView.LIST.contains(SimpleAskView.answer)) {
            LoginView.run();
        }
        boolean variable = true;
        while (variable) {
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
                    SimpleAskView simpleAskView1 = new SimpleAskView("Do you really want to exit?\ny/n");
                    SimpleAskView.run();
                    if (simpleAskView1.LIST2.contains(SimpleAskView.answer)) {
                        variable = true;
                    } else if (simpleAskView1.LIST.contains(SimpleAskView.answer)) {
                        variable = false;
                        break;
                    }
            }
        }
    }
}

