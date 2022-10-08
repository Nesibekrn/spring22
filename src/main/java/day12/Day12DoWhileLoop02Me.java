package day12;

import java.util.Scanner;
/* Username is "admin", Password is "pwd123"
        Ask user to enter username and password
        User should see "Enter your username and password" message
        If he enters correct credentials he should get "You are in your account!" message
        Otherwise, he should see "Enter your username and password" message 3 times
        After 3 times he should get "Your account is blocked" message

        */
public class Day12DoWhileLoop02Me {
    public static void main(String[] args) {
        String name = "";
        String pwd = "";
        int i = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter username");
            name = input.next();
            System.out.println("Enter password");
            pwd = input.next();
            if (name.equals("admin") && pwd.equals("pwd123")) {
                System.out.println("you are in your accoount");
            }
            break;

    }
            while (i < 4);
                System.out.println("Enter your username");
                System.out.println("Enter your password");
                System.out.println("Your account is blocked");



    }
}
