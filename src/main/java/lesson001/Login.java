package lesson01;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //login credentials
        String user = "admin123";
        String email = "tech@gmail.com";
        String pass = "techpro12";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your username or email: ");
        String username = sc.nextLine();
        System.out.println("Please enter your password: ");
        String password = sc.nextLine();
        if((username.equals(user) || username.equals(email)) && password.equals(pass)){
            System.out.println("Welcome, you are logged in!");
        }else{
            System.out.println("Please enter valid credentials");
        }
    }
}