package Solution09;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App09 {
    static Solver09 InputHandler(){
        String UserInput;
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the length of the room? ");
        UserInput = Scanner.next();
        int Length = Integer.parseInt(UserInput);

        System.out.print("What is the width of the room? ");
        UserInput = Scanner.next();
        int Width = Integer.parseInt(UserInput);

        return new Solver09(Length,Width);

    }

    public static void Printer(Solver09 Results){
        System.out.println("You will need to purchase " + Results.Gallons + " gallons to cover " + Results.SquareFeet + " square feet.");

    }

    public static void main(String[] args) {
        Solver09 Results = InputHandler();
        Printer(Results);
    }

}
