package com.basics;


import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /*
        String fruit = in.next();

        switch (fruit) {
            case "Mango" -> System.out.println("A King of Fruits");
            case "Apple" -> System.out.println("A sweet red Fruits");
            case "Orange" -> System.out.println("Round Fruits");
            case "Grapes" -> System.out.println("Small Fruits");
            default -> System.out.println("Please enter a valid Fruits");
        }

           */




//        int day = in.nextInt();
//        switch (day) {
//
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }



//        int day = in.nextInt();
//        switch (day) {
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekend");
//                break;
//        }


        int day = in.nextInt();
        switch (day) {

            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }



//        if (fruit.equals("mango")){  // ( .equals only check the value ),
//            System.out.println("King of fruit");
//        }
//
//        if (fruit.equals("apple")){
//            System.out.println("a sweet red fruit");
//        }


//        String a = "Hello";
//        String b = "Hello";
//
//        System.out.println( a == b);  // only one "Hello" object a and b pointing same object

    }
}


/*

    - cases have to be the same type as expressions, must be a constant or literal
    - duplicate case values are not allowed
    - break is use to terminate the sequence
    - if break is not used, it will continue to next case
    - default will execute when none of the above does
    - if default is not at the end, put break after it

 */