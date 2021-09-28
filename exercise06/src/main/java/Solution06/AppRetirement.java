package Solution06;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class AppRetirement {
    static Solution06.Solver InputHandler(){
        String UserInput;
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        UserInput = Scanner.next();
        int RetireAge = Integer.parseInt(UserInput);

        System.out.print("At what age would you like to retire? ");
        UserInput = Scanner.next();
        int CurrentAge = Integer.parseInt(UserInput);

        return new Solution06.Solver(RetireAge,CurrentAge);

    }

    public static void Printer(Solution06.Solver Results){
        System.out.println("You have " + Results.YearsToRetire + " years left until you can retire.");
        System.out.println("It is " + Results.CurrentYear + ", so you can retire in " + Results.RetireYear);
    }

    public static void main(String[] args) {
        Solution06.Solver Results = InputHandler();
        Printer(Results);
    }

}
