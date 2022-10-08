package review.praPra;

import java.util.Scanner;

public class Pra01Done {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        /*
         Ask user to enter a character and check if it is a letter.
         If it is not a letter print "Not Letter" on console.
         If it is letter check if it is lowercase or uppercase letter.
         If it is lowercase print "Lowercase Letter", if it is uppercase letter print "Uppercase Letter" on console.(ternary)
         */
        System.out.println("enter a character");
        char a=input.next().charAt(0);
        System.out.println(a);
        System.out.println(a>='A' && a<='z' ? (a>='A'&&a<='Z'?"uppercase":"lowercase"):"not letter");










    }
}
