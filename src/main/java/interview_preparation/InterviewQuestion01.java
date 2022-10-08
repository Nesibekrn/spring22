package interview_preparation;

import java.util.Scanner;

public class InterviewQuestion01 {
    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap them
        // a=12 and b=13 ==> a=13 and b=12
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first numbers");

         double a = input.nextDouble();

        System.out.println("Enter second numbers");
        double b = input.nextDouble();

        //1. Way
//        System.out.println("Before swapping"+" "+a+"-"+b);
//        double temp = 0;
//        temp = b;
//        b = a;
//        a = temp;
//        System.out.println("After swapping"+" "+a+"-"+b);

        //2.Way
        System.out.println("Before swapping"+" "+a+"-"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping"+" "+a+"-"+b);

    }
}
