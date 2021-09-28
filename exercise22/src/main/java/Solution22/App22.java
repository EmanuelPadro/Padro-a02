package Solution22;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.ArrayList;
import java.util.Scanner;

public class App22 {
    static ArrayList<Integer> InputHandler(){
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Integer> Numbers = new ArrayList<>();

        System.out.print("Enter the first number: ");
        Numbers.add(Integer.parseInt(Scanner.next()));

        System.out.print("Enter the second number: ");
        Numbers.add(Integer.parseInt(Scanner.next()));

        System.out.print("Enter the third number: ");
        Numbers.add(Integer.parseInt(Scanner.next()));

        return Numbers;
    }

    private static int Comparer(ArrayList<Integer> Numbers) {
        //will quit if detects that user has inputted all the same number
        if(Numbers.get(0).equals(Numbers.get(1)) && Numbers.get(1).equals(Numbers.get(2))){
            System.exit(0);
        }

        int BigNum = 0;

        if(Numbers.get(0)>=Numbers.get(1) && Numbers.get(0)>=Numbers.get(2)){
            BigNum = Numbers.get(0);
        }else if(Numbers.get(1)>=Numbers.get(0) && Numbers.get(1)>=Numbers.get(2)){
            BigNum = Numbers.get(1);
        }
        else if(Numbers.get(2)>=Numbers.get(1) && Numbers.get(2)>=Numbers.get(0)){
            BigNum = Numbers.get(2);
        }

        return BigNum;
    }


    public static void Printer(int BigNumber){
        System.out.println("The largest number is " + BigNumber);
    }

    public static void main(String[] args) {
        ArrayList<Integer> Numbers = InputHandler();
        int BigNumber = Comparer(Numbers);
        Printer(BigNumber);
    }

}