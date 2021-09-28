package Solution15;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App15 {
    static Solver15 InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("What is the password? ");
        String Input = Scanner.next();

        return new Solver15(Input);

    }

    public static void Printer(Solver15 Results){
        System.out.println(Results.Output);
    }

    public static void main(String[] args) {
        Solver15 Results = InputHandler();
        Printer(Results);
    }

}
