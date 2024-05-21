package com.abhishek;

import java.util.Scanner;

public class Tempconversion {
    public static void main(String[] args) {
        System.out.println("Welcome to the Temperature Conversion program");
        System.out.print("Enter the temp in C: ");
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        double result = ( num * 9/5  ) + 32;
        System.out.println("Temp in Fahrenheit is : " + result);
    }
}
