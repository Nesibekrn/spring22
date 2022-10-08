package qB;

import java.util.Scanner;

public class Qb3_4_5_6 {
    public static void main(String[] args) {
        double bag = 25.6;
        double pen = 6.8;
        double eraser = 4.2;
        System.out.println("Total Price"+" "+(bag+pen+eraser));

        float price = 123.5f;
        long microbsOfCovid = 7123456L;
        int carsOfAnkara = 1000000;
        System.out.println("Total"+" "+(price+microbsOfCovid+carsOfAnkara));

        double principal = 123000;
        double rate = 15;
        int numberOfYear = 5;
        System.out.println("The Simple Interest is"+" "+(principal*rate*numberOfYear/100));

        String a = "A";
        long x = 123L;
        long y = 456L;
        System.out.println("Sum is"+" "+(x+y+a));
        System.out.println("Multiplication is"+" "+((x*y)+a));

        boolean isHigh = true;
        boolean isFat = false;
        System.out.println(isHigh+" "+isFat);

        float book = 25.8f;
        float notebook = 12.6f;
        float laptop = 20500f;
        System.out.println("The total price is"+" "+(book*2+notebook*4+laptop*3));

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers to swap");
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        System.out.println("Before swapping"+" "+n1+"-"+n2);
        /*
        double temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swapping"+" "+n1+"-"+n2);
        */
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After seapping"+" "+n1+"-"+n2);

        short c = 25000;
        int d = c;

        long population = 12563L;
        int newppltn = (int)population;

        double label = 123.6;
        float newlabel = (float)label;

        double fruit = 23.6;
        short newFruit = (short)fruit;
        System.out.println(newFruit);

        byte phone = 85;
        double newphone = phone;
        System.out.println(newphone);

        byte min = Byte.MIN_VALUE;
        short max = Short.MAX_VALUE;
        System.out.println("sum"+" "+(min+max));

        byte small = Byte.valueOf("113");
        short big = Short.valueOf("2351");
        System.out.println(big-small);







    }


}
