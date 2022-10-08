package practice01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //Take from user firstname,lastname,age,weight,height.
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String firstName = input.next();

        System.out.println("Enter your Last Name");
        String lastName = input.next();

        System.out.println("Enter your Age");
        int age = input.nextInt();

        System.out.println("Enter your Height");
        double height = input.nextDouble();

        System.out.println("Enter your Weight");
        int weight = input.nextInt();
        System.out.println("First Name:"+" "+firstName+"\n"+"Last Name:"+" "+lastName+"\n"+"Age:"+" "+age+"\n"+"Height:"+" "+height+"\n"+"Weight:"+" "+weight);
    }

}
