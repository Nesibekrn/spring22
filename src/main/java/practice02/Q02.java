package practice02;

import java.util.Scanner;
/*
      Ask user to enter two words. If the number of characters of the first word is even, then put the second word into the middle of the first word.
      If the number of characters of second word is odd, then print on console "You can not put second word into the middle of the first word. Because it's number of character is odd.".
       */
public class Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first words");
        String word1=input.nextLine().trim().toUpperCase();
        System.out.println("Enter second words");
        String word2=input.nextLine().trim().toUpperCase();

        if(word1.length()%2==0){
            String part1=word1.substring(0,word1.length()/2);
            String part2= word1.substring(word1.length()/2);
            System.out.println(part1+""+word2+""+part2);

        }else{
            System.out.println("you can not put second word into the middle of first word");
        }



    }
}
