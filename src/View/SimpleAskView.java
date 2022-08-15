package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleAskView {
    private static final Scanner SCANNER = new Scanner(System.in);
    static boolean answer = false;

    private static final List<String> LIST = new ArrayList<>();




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
        System.out.println("Are u sure?");
        String action = SCANNER.nextLine();
        if (LIST.contains(action)){
            System.out.println("Well done");
            answer = true;
        }
        else{
            answer = false;
            System.out.println("Wrong\nTry more");
            for (int i = 0; i < 3; i++) {
                String answer = SCANNER.nextLine();
                if(LIST.contains(answer)){
                    System.out.println("Well done");
                    break;
                }
                else {
                    System.out.println("Wrong");

                }
            }
        }


    }
}
