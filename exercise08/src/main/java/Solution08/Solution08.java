package Solution08;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class Solution08 {
    static Solver08 InputHandler(){
        String UserInput;
        Scanner Scanner = new Scanner(System.in);

        System.out.print("How many People? ");
        UserInput = Scanner.next();
        int People = Integer.parseInt(UserInput);

        System.out.print("How many Pizzas do you have? ");
        UserInput = Scanner.next();
        int Pizzas = Integer.parseInt(UserInput);

        System.out.print("How many slices per pizza? ");
        UserInput = Scanner.next();
        int SlicesPerPizza = Integer.parseInt(UserInput);

        return new Solver08(People,Pizzas,SlicesPerPizza);

    }

    public static void Printer(Solver08 Results){
        System.out.println(Results.People + " people with " + Results.Pizzas + " pizzas ( " + Results.SlicesTotal + " slices)");
        System.out.println("Each person gets " + Results.SlicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + Results.SlicesLeftover + " leftover pieces");
    }

    public static void main(String[] args) {
        Solver08 Results = InputHandler();
        Printer(Results);
    }
}
