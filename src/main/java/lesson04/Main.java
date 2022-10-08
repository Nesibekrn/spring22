package lesson04;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String str1 = "abcdefghijklmnopqrstuvwxyz";
    String str2 = "zyxwvutsrqponmlkjihgfedcbc";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String to encrypt");

        String str3 = scan.nextLine().toLowerCase();

        //using the nested loop
        for (int i=0; i< str3.length(); i++){
            for(int j=0; j<26; j++){
                if(str3.charAt(i) == str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }
            }
        }

    }
}
