package Solution19;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App19 {
    static Solver19 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is your height: ");
        double Height = Double.parseDouble(Scanner.next());

        System.out.print("What is your weight: ");
        double Weight = Double.parseDouble(Scanner.next());

        return new Solver19(Height,Weight);

    }

    public static void Printer(Solver19 Results){
        System.out.println("Your BMI is " + Results.BMI);
        if(Results.BMI <= 32.5 && Results.BMI >= 18.5){
            System.out.println("You are within the ideal weight range.");
        }
        if(Results.BMI > 32.5){
            System.out.println("You are overweight. You should see your Doctor.");
        }
        if(Results.BMI < 18.5){
            System.out.println("You are underweight. You should see your Doctor.");
        }

    }

    public static void main(String[] args) {
        Solver19 Results = InputHandler();
        Printer(Results);
    }

}
