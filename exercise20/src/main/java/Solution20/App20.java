package Solution20;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App20 {
    static Solver20 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double Order = Double.parseDouble(Scanner.nextLine());

        System.out.print("What State will you be shipping to? ");
        String State = Scanner.nextLine();

        String County = "Not Applicable";
        if(State.equals("Wisconsin"))
        {
            System.out.print("What country do you live in? ");
            County = Scanner.nextLine();
        }
        System.out.println(County);
        return new Solver20(Order,State,County);

    }

    public static void Printer(Solver20 Results){
        System.out.println("The tax is $" + Results.Tax);
        System.out.println("The Total is $" + Results.Total);
    }

    public static void main(String[] args) {
        Solver20 Results = InputHandler();
        Printer(Results);
    }

}
