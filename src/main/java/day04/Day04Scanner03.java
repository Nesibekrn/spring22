package day04;

import java.util.Scanner;

public class Day04Scanner03 {


 /*
        Ask user to enter the width, length and the height of a rectangular prism then find the volume.
        Volume = width * length * height
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter widht");
        double widht = input.nextDouble();

        System.out.println("Enter lenght");
        double lenght = input.nextDouble();

        System.out.println("Enter height");
        double height = input.nextDouble();

        System.out.println("Volume is "+(widht*lenght*height));



    }

}

