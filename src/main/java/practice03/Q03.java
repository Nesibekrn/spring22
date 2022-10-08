package practice03;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        /*
    Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
    A perfect number is a positive integer that is equal to the sum of all its proper divisors.
    6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
     */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer");
        int j= input.nextInt();
        int sum=0;
        for (int k = 1; k <j ; k++) {
            if(j%k==0){
                sum=sum+k;}
        }if(sum==j){
            System.out.println("Perfect Number");
        }else{
            System.out.println("Not Perfect Number");
        }
    }
}
