package day07;

import java.util.Scanner;

public class Day07Switch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any month name");
        String month = input.next();
        //Ask user to enter the month name then print the month number
        //1.way
        if(month.equalsIgnoreCase("January")){
            System.out.println(1);
        }else if(month.equalsIgnoreCase("february")) {
            System.out.println(2);
        }else if(month.equalsIgnoreCase("march")) {
            System.out.println(3);
        }else if(month.equalsIgnoreCase("april")) {
            System.out.println(4);
        }else if(month.equalsIgnoreCase("may")) {
            System.out.println(5);
        }else if(month.equalsIgnoreCase("june")) {
            System.out.println(6);
        }else if(month.equalsIgnoreCase("july")) {
            System.out.println(7);
        }else if(month.equalsIgnoreCase("auguts")) {
            System.out.println(8);
        }else if(month.equalsIgnoreCase("september")) {
            System.out.println(9);
        }else if(month.equalsIgnoreCase("october")) {
            System.out.println(10);
        }else if(month.equalsIgnoreCase("november")) {
            System.out.println(11);
        }else if(month.equalsIgnoreCase("december")) {
            System.out.println(12);
        }else{
            System.out.println("Please enter a valid month name");
        }

        //2.way
         switch (month.toLowerCase()){
            case "january":
                System.out.println(1);
                break;
            case "february":
                System.out.println(2);
                break;
            case "march":
                System.out.println(3);
                break;
            case "april":
                System.out.println(4);
                break;
            case "may":
                System.out.println(5);
                break;
            case "june":
                System.out.println(6);
                break;
            case "july":
                System.out.println(7);
                break;
            case "auguts":
                System.out.println(8);
                break;
            case "september":
                System.out.println(9);
                break;
            case "october":
                System.out.println(10);
                break;
            case "november":
                System.out.println(11);
                break;
            case "december":
                System.out.println(12);
                break;
            default:
                System.out.println("Please enter a valid month name");
        }

        }
    }

