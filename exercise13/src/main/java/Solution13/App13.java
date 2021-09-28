package Solution13;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App13 {
    static Solver13 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double Principal = Double.parseDouble(Scanner.next());

        System.out.print("What is the rate? ");
        double Rate = Double.parseDouble(Scanner.next());

        System.out.print("What is the number of years? ");
        int Years = Integer.parseInt(Scanner.next());

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = Integer.parseInt(Scanner.next());

        return new Solver13(Principal,Rate,Years,n);

    }

    public static void Printer(Solver13 Results){
        System.out.println("$" + Results.Principal + " invested at " +  Results.Rate*100 + "% for "
                + Results.Years + " years compounded " + Results.n + " times per year is $" + Results.Accrued);
    }

    public static void main(String[] args) {
        Solver13 Results = InputHandler();
        Printer(Results);
    }

}
