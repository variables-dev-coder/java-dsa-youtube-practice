package com.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//
//        System.out.println("Sum= " + sum); // 30 + 40 -> 70


//        float num1 = input.nextInt();
//        float num2 = input.nextInt();
//
//        float sum = num1 + num2;
//
//        System.out.println("Sum= " + sum); // 30 + 40 -> 70.0

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        float sum = num1 + num2;

        System.out.println("Sum= " + sum); // 30 + 40 -> 70.0


    }

}
