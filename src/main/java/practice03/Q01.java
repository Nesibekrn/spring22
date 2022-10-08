package practice03;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Print numbers from given number till the next multiple of 10.
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int i= input.nextInt();
        while(i%10!=0) {
            System.out.println(i + " ");
            i++;
        }
    }
}
