package lesson01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input >=0){
            System.out.println(input+" is a positive number");
        }else{
            System.out.println(input+" is a negative number");
        }
    }
}