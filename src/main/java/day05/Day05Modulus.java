package day05;

import java.util.Scanner;

public class Day05Modulus {
    /*
           Modulus Operator: % is called "modulus operator" in java
           it returns the remainder in a division operation
           13/5===> modulus operator gives you 3
           13%5===>3
            */
    public static void main(String[] args) {

        //ask user to enter an integer the print the last digit of an integer on the console

       Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer");
        int n = input.nextInt();
        int absN = Math.abs(n);

        //Ask user to enter an integer the print the last digit of the integer on the console

        /*int lastDigit = absN%10;
        System.out.println(lastDigit);

        //ask user to enter his borth year then print just last 2 digits on the console

       Scanner lay = new Scanner(System.in);
        System.out.println("Enter your borth year");
        int z = lay.nextInt();
        int absZ = Math.abs(z);

        int lastTwoDigits = absZ%100;
        System.out.println("lastTwoDigits"+lastTwoDigits);


        //ask user to enter an integer then check if the number is even
        System.out.println("İs the number even? "+(absN%2==0));

        //ask user to enter an integer then check if the number is odd

        System.out.println(absN%2==1);

         */

        //ask user to enter a 3 digits integer and find the sum of the digits
        int last = absN%10;

        absN = absN/10;
        int second = absN%10;

        absN=absN/10;
        int first =absN%10;

        System.out.println(last+second+first);



    }




}
