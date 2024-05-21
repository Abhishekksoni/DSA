//Q Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all

package assignment;

import java.util.Scanner;

public class Userx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number( or x to terminate): ");
        int sum = 0;

        while(true){

            String userInput = input.nextLine();

            if(userInput.equals("x")){
                break;
            }

            try{
                int number = Integer.parseInt(userInput);
                sum += number;
            }
            catch (NumberFormatException e){
                System.out.println("Invalid Input");
            }
        }
        System.out.println("The sum of all numbers entered is: " + sum);
    }
}