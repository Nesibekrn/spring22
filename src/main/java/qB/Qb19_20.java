package qB;

import java.util.Scanner;

public class Qb19_20 {
    public static void main(String[] args) {
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a month name");
        String monthName = input.next();
        monthName =monthName.toLowerCase();

        if(monthName.equals("december")||monthName.equals("january")||monthName.equals("february")){
            System.out.println("Winter");
        }else if(monthName.equals("march")||monthName.equals("april")||monthName.equals("may")){
            System.out.println("Spring");
        }else if(monthName.equals("june")||monthName.equals("july")||monthName.equals("august")){
            System.out.println("Summer");
        } else if (monthName.equals("september")||monthName.equals("november")||monthName.equals("october")) {
            System.out.println("Fall");
        }else{
            System.out.println("Invalid month name");
        }
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password");
        String pwd = input.nextLine();

        if(pwd.replaceAll("[\\S]","").length()>0){
            System.out.println("do not use");
        }else if(pwd.length()>7){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }

    }
}
