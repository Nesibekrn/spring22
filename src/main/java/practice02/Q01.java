package practice02;

import java.util.Scanner;
//Ask user to enter first name, middle name and last name as one single String, then print the first character of middle name and last name.
//e.g. Mark Hansel Twain==> HT
public class Q01 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your firstname, lastname and middle name.");
        String fullName = input.nextLine().trim().toUpperCase();

        char c = fullName.charAt(fullName.indexOf(" ")+1);
        char b = fullName.charAt(fullName.lastIndexOf(" ")+1);
        System.out.println(c+""+b);

    }
}
