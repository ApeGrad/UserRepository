package Lesson8.View;

import Lesson8.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleAskView {
    static String question;
    private static final Scanner SCANNER = new Scanner(System.in);
    static boolean answer = false;

    private static final List<String> LIST = new ArrayList<>();

    public SimpleAskView(String question) {
        this.question = question;

    }


    public static void main(String[] args) {
        run();


    }

    public static void run(){
        LIST.add("YES");
        LIST.add("yes");
        LIST.add("1");
        LIST.add("y");
        LIST.add("Yes");
        LIST.add("Y");
        System.out.println(question);
        String action = SCANNER.nextLine();
        if (LIST.contains(action)){
            System.out.println("Ok, have a nice day");
            answer = true;
        }
        else{
            answer = false;
            System.out.println("Wrong\nTry more");
            for (int i = 0; i < 3; i++) {
                String answer = SCANNER.nextLine();
                if(LIST.contains(answer)){
                    System.out.println("Ok, have a nice day");
                    break;
                }
                else {
                    System.out.println("Wrong");

                }
            }
        }


    }
}
