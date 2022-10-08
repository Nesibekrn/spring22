package practice03;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
   Get the number of rows from user then draw a right triangle by using asterixs
   Number of rows = 4 ==>    *
                             * *
                             * * *
                             * * * *
   */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an row number");
        int r= input.nextInt();
        for (int i = 1; i <r+1 ; i++) {
            for (int j = 0; j <i ; j++) {

                System.out.print("* ");
            }
            System.out.println();


        }
    }
}
