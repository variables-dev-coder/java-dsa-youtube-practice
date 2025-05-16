package com.basics;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


        /*

            Syntax of for loops:

            for (initialisation; condition; increment/decrement){
                // body
            }

         */

        // Q: Print numbers from 1 to 5

//        for (int num = 1; num <= 5; num += 1){
//            System.out.println(num);
//        }

        // Print numbers from 1 to n

//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//
//        for (int num = 1; num <= n; num++){
//            System.out.println(num + " ");
//        }

        // While loop
        /*
            Syntax:
            while (condition){
            // body
            }

         */

//        int num = 1;
//        while (num <= 5){
//            System.out.println(num);
//            num += 1;
//        }

        // do while loop
        /*
            do{
                // body
            } while (condition)

         */

        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);
    }
}
