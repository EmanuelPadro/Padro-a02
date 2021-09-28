package Solution07;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class AppRectArea {
    static Solver07 InputHandler(){
        String UserInput;
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        UserInput = Scanner.next();
        double length = Integer.parseInt(UserInput);

        System.out.print("What is the length of the room in width? ");
        UserInput = Scanner.next();
        double width = Integer.parseInt(UserInput);

        return new Solver07(length,width);

    }

    public static void Printer(Solver07 Results){
        System.out.println("The area is " + Results.AreaFeet + " square feet.");
        System.out.println("Which is " + Results.AreaMeters + " square meters");
    }

    public static void main(String[] args) {
        Solver07 Results = InputHandler();
        Printer(Results);
    }
}
