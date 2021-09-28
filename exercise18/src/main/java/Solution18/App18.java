package Solution18;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App18 {
    static String TempChoice(){
        Scanner Scanner = new Scanner(System.in);
        String choice;

        System.out.println("Press C to convert from Fahrenheit to Celsius");
        System.out.println("Press F to convert from Celsius to Fahrenheit");
        String Input = Scanner.next();
        char KorC = Input.charAt(0);

        if(KorC == 'c'|| KorC =='C'){choice = "Celsius";}
        else if(KorC == 'f'|| KorC == 'F'){choice = "Fahrenheit";}
        else{
            choice = "your input has resulted in an error please try again";
            System.exit(1);
        }

        System.out.println("Your choice: "+ choice);

        return choice;

    }

    public static void Calculations(String choice){
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter the temperature in Fahrenheit: ");
        double Temperature = Scanner.nextDouble();

        if(choice.equals("Celsius")){
            Temperature = (Temperature -32) * 5/9;
        }
        else if(choice.equals("Fahrenheit")){
            Temperature = (Temperature * 9 / 5 ) + 32;
        }
        else{
            System.exit(1);
        }
        System.out.println("The temperature in " + choice + " is " + Temperature);
    }

    public static void main(String[] args) {
        String choice = TempChoice();
        Calculations(choice);
    }

}
