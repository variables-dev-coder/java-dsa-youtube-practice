package com.basics;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

//        switch (empID){
//            case 1:
//                System.out.println("Munna");
//                break;
//            case 2:
//                System.out.println("Aziz");
//                break;
//            case 3:
//                System.out.println("Mr Mondal");
//                switch (department) {
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Management":
//                        System.out.println("Management Department");
//                        break;
//                    default:
//                        System.out.println("No Department found");
//                }
//                break;
//            default:
//                System.out.println("Enter correct EmpID");


        // Better Way to write

        switch (empID) {
            case 1 -> System.out.println("Munna");
            case 2 -> System.out.println("Aziz");
            case 3 -> {
                System.out.println("Mr Mondal");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department found");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
