package practice01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
    /*
         Ask user to enter a character and check if it is a letter.
         If it is not a letter print "Not Letter" on console.
         If it is letter check if it is lowercase or uppercase letter.
         If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a chracter");
        char c = input.next().charAt(0);

        System.out.println(c>='A'&& c<='Z'|| c>='a'&& c<='z' ? (c>='A'&& c<='Z'? "Uppercase Letter":"Lowercase Letter") : "Not Letter");

        //    x>='A'&&x<='Z'?"Uppercase":(x>='a'&&x<='z'?"Lowercase":"Not letter");


    }
}
