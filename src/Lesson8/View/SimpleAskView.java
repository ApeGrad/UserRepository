package Lesson8.View;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleAskView {
    static String question;
    private static final Scanner SCANNER = new Scanner(System.in);
    static String answer;

    public static final List<String> LIST = new ArrayList<>();
    public static final List<String> LIST2 = new ArrayList<>();



    public SimpleAskView(String question) {
        this.question = question;
        LIST.add("YES");
        LIST.add("yes");
        LIST.add("1");
        LIST.add("y");
        LIST.add("Yes");
        LIST.add("Y");
        LIST2.add("no");
        LIST2.add("NO");
        LIST2.add("n");
        LIST2.add("2");
    }
    public static void run(){
        System.out.println(question);
        answer = SCANNER.nextLine();
        if (LIST.contains(answer) | LIST2.contains(answer)){
            System.out.println("\nOk");
        }
        else{
            System.out.println("Wrong\nTry more");
            for (int i = 0; i < 3; i++) {
                answer = SCANNER.nextLine();
                if(LIST.contains(answer) | LIST2.contains(answer)){
                    System.out.println("\nOk");
                    break;
                }
                if(i==2) {
                    if (!LIST.contains(answer) && !LIST2.contains(answer))
                        System.out.println("ERROR: unexpected answer");
                    break;
                }
                else {
                    System.out.println("Wrong");

                }
            }
        }
    }
}
