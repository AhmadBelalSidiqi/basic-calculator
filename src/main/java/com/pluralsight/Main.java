package com.pluralsight;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double numb1;
        double numb2;
        String menu;
        String operation;
        Scanner scanner = new Scanner(System.in);

        //Input for Two floating point numbers
        System.out.println("Enter the first number: ");
        numb1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the second number;");
        numb2 = Integer.parseInt(scanner.nextLine());

        //Input for calculations operations
        // Java Text Box.
        menu= """
                Possible Calculation :
                (A)dd
                (S)ubtract
                (M)ultiply
                (D)ivide
                Please select an option :
               """;
        System.out.println(menu);
        operation = scanner.nextLine();

        //multiplying the floating point numbers
        System.out.println(numb1+" * "+numb2+" = "+numb1 * numb2);


    }
}