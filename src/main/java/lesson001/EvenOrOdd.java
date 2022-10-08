package lesson01;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        if(input%2 == 0){
            System.out.println(input+" is even number");
        }else{
            System.out.println(input+" is odd number");
        }
    }
}