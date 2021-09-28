package Solution11;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App11 {
    static Solver11 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("How many euros are you exchanging? ");
        double euros = Double.parseDouble(Scanner.next());

        System.out.print("What is the exchange rate? ");
        double rate = Double.parseDouble(Scanner.next());

        return new Solver11(euros,rate);
    }

    public static void Printer(Solver11 Results){
        System.out.println(Results.euros + " euros at an exchange rate of " + Results.rate + " is\n" + Results.dollars + " U.S. dollars.");
    }

    public static void main(String[] args) {
        Solver11 Results = InputHandler();
        Printer(Results);
    }

}
