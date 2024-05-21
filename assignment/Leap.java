//Q Input a year and find whether it is a leap year or not.

package assignment;

import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        System.out.print("Enter the year: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if( num % 4 == 0 ) {
            System.out.println(num + " is a Leap Year");
        }
        else{
            System.out.println(num + " is not a leap year");
        }
    }
}
