package Lesson8;

import Lesson8.View.SimpleAskView;
import Lesson8.View.StartMenu;

public class Main {
    public static void main(String[] args) {
        StartMenu.run();

        SimpleAskView simpleAskView = new SimpleAskView("Do you really want to exit?");
        SimpleAskView.run();


    }
}
