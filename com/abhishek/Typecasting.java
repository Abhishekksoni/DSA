package com.abhishek;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        #narrowing casting
//        int num = (int) (67.89f);
//        System.out.println(num);

//        #widening casting
//        int num = input.nextInt();
//        double doublenum = num;
//        System.out.println(doublenum);

//       # automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); 257%256 = 1
//        because the max size of byte is 256

        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = a * b / c;
        System.out.println(d);

//        the byte can only store max of 256 and the reason this code running even the multiplication of 40 and 50 exceeds
//        the max range of byte, the java automatically promoting each byte to integer when its evaluating this
//        int d = a * b / c; expression

//        if float + int - double = double => converting to biggest one
    }
}


//when one type of data is assigned to another type of variable and automatic type conversion will take place
//if the following conditions are meet
//casting and conversion are two ways to change the data type of a variable. Casting is done explicitly by the programmer, while conversion is done implicitly by the compiler.
//There are two types of casting: widening and narrowing. Widening casting is when a smaller data type is converted to a larger data type. This is done automatically by the compiler and is safe. Narrowing casting is when a larger data type is converted to a smaller data type. This requires manual intervention and is used when there is a possibility of data loss.