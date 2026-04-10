package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numb1;
        double numb2;
        String operation;


        Scanner scanner = new Scanner(System.in);

        //Input for Two floating point numbers
        System.out.println("Enter the first number: ");
        numb1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number;");
        numb2 = Integer.parseInt(scanner.nextLine());

        //Input for calculations operations
        System.out.println("Possible calculations :");
        System.out.println("(A)dd"); System.out.println("(S)ubtract");
        System.out.println("(M)ultiply)");System.out.println("(D)ivide");

        System.out.println("Please select an option :");
        operation = scanner.nextLine();

        //multiplying the floating point numbers
        System.out.println(numb1+" * "+numb2+" = "+numb1 * numb2);


    }
}