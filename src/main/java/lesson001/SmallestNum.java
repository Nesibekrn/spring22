package lesson01;

import java.util.Scanner;

public class SmallestNum {
    public static void main(String[] args) {
        //finding the smallest number
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        num2 = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        num3 = sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println(num1+" is smallest than "+num2+" and "+num3);
        }else if(num2<num1 && num2<num3){
            System.out.println(num2+" is smallest than "+num1+" and "+num3);
        }else{
            System.out.println(num3+" is smallest than "+num1+" and "+num2);
        }
    }
}