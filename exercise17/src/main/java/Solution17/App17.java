package Solution17;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App17 {
    static Solver17 InputHandler(){
        Scanner Scanner = new Scanner(System.in);
        int gender;
        do {
            System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
            gender = Scanner.nextInt();
        }while(gender != 1 && gender != 2 );

        System.out.print("How many ounces of alcohol did you have? ");
        double ounces = Scanner.nextDouble();

        System.out.print("What is your weight, in pounds? ");
        int weight = Scanner.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        int hours = Scanner.nextInt();

        return new Solver17(gender,ounces,weight,hours);

    }

    public static void Printer(Solver17 Results){
        System.out.println("Your BAC is " + Results.BAC + "\n" + Results.Output);
    }

    public static void main(String[] args) {
        Solver17 Results = InputHandler();
        Printer(Results);
    }

}
