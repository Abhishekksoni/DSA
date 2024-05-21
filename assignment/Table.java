// Q Take a number as input and print the multiplication table for it.

package assignment;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        System.out.print("Enter the no you want the table of: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Table of " + num + " is: ");
        for(int a = 1; a != 11; a++) {

            System.out.println(num*a);
        }
    }
}
