package Solution21;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class App21 {
    static int InputHandler(){
        Scanner Scanner = new Scanner(System.in);

        System.out.print("Please enter the number of the month: ");

        return Integer.parseInt(Scanner.next());
    }

    private static String MonthList(int Num) {
        return switch (Num) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException("Unexpected value: " + Num);
        };
    }

    public static void Printer(String Month){
        System.out.println("The name of the month is " + Month);
    }

    public static void main(String[] args) {
        int Num = InputHandler();
        String Month = MonthList(Num);
        Printer(Month);
    }

}
