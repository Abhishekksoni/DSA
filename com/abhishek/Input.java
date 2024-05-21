package com.abhishek;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your input: ");
        int rollno = input.nextInt();
        System.out.printf("Your roll number is: " + rollno);
    }
}

