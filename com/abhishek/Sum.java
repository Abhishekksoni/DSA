package com.abhishek;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextInt();
        float num2 = input.nextInt();

        float sum = num1 + num2;
        System.out.print("Sum=" + sum);
    }
}