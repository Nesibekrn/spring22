package practice01;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /*
        Type java code by using ternary. Ask user to enter two integers
        Write a program to print the maximum  one on the console.(Do not forget they may be equal)
       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter to first integer");
        int a = input.nextInt();
        System.out.println("Enter to second integer");
        int b = input.nextInt();

        System.out.println(a>b ? "Maximum value is:"+" "+a : (a == b ? "they are equal":"Maximum value is:"+" "+ b));


    }
}
