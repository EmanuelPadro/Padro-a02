package Solution12;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App12 {
    static Solver12 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        double Principal = Double.parseDouble(Scanner.next());

        System.out.print("Enter the rate of interest: ");
        double Rate = Double.parseDouble(Scanner.next());

        System.out.print("Enter the number of years: ");
        int Years = Integer.parseInt(Scanner.next());

        return new Solver12(Principal,Rate,Years);

    }

    public static void Printer(Solver12 Results){
        System.out.println("After " + Results.Years + " years at " + Results.Rate*100 + "%, the investment will" +
                " be worth $" + Results.Accrued + "");
    }

    public static void main(String[] args) {
        Solver12 Results = InputHandler();
        Printer(Results);
    }

}
