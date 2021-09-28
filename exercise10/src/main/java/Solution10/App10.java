package Solution10;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App10 {
    static Solver10 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the price of item 1: ");
        double Item1P = Integer.parseInt(Scanner.next());

        System.out.print("Enter the quantity of item 1: ");
        int Item1Q = Integer.parseInt(Scanner.next());

        System.out.print("Enter the price of item 2: ");
        double Item2P = Integer.parseInt(Scanner.next());

        System.out.print("Enter the quantity of item 2: ");
        int Item2Q = Integer.parseInt(Scanner.next());

        System.out.print("Enter the price of item 3: ");
        double Item3P = Integer.parseInt(Scanner.next());

        System.out.print("Enter the quantity of item 3: ");
        int Item3Q = Integer.parseInt(Scanner.next());

        return new Solver10(Item1P,Item1Q,Item2P,Item2Q,Item3P,Item3Q);

    }

    public static void Printer(Solver10 Results){
        System.out.println("Subtotal: $" + Results.Subtotal);
        System.out.println("Tax: $" + Results.Tax);
        System.out.println("Total: $" + Results.Total);
    }

    public static void main(String[] args) {
        Solver10 Results = InputHandler();
        Printer(Results);
    }
}
