package lesson04;

import java.util.Scanner;

public class EncryptString2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to encrypt");

        String str = scan.nextLine().toLowerCase();
        for(int i=0; i<str.length(); i++){
            int index = 'z' - str.charAt(i);
            System.out.print((char)(('a') + index));
        }

    }
}
