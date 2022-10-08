package day07;

import java.util.Scanner;

public class Day07Switch03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c = input.next().toLowerCase().charAt(0);
        //Ask user to enter a character, if it is vowel letter print "Vowel", if it is not vowel print "Not vowel", if it is not letter
        //print "Enter a letter"
        switch(c){
            case'a':
            case  'e':
            case 'i':
            case'o':
            case'u':
                System.out.println("Vowel");
                break;
            case'f':
            case 'g':
            case 'h':
            case's':
            case'y':
                System.out.println("Not vowel");
                break;
            default:
                System.out.println("Enter a letter not the others...");






        }



    }
}
