package review.lesLes;

import java.util.Scanner;

public class Lesson01Done {
    public static void main(String[] args) {
        //	Conditional Statements:
//Write a program that takes input from the user and tell whether the number is negative or positive
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();

        if(a<0){
            System.out.println("the number is negative");
        }else{
            System.out.println("the number is positive");
        }*/

//Write a program that takes input from the user and tell whether the number is even or odd
       /* Scanner input=new Scanner(System.in);
        System.out.println("enter a number");
        int a= input.nextInt();

        if(a%2==0){
            System.out.println("number is even");
        }else{
            System.out.println("number is odd");
        }*/

//Write a program that take 3 numbers from the user and tell which number is smallest
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int a= input.nextInt();
        System.out.println("enter second number");
        int b= input.nextInt();
        System.out.println("enter thirth number");
        int c= input.nextInt();

        int min=Math.min(a,Math.min(b,c));
        System.out.println(min);*/

/*	Make k login System in java
o	Username: admin123
o	Email: tech@gmail.com
o	Password: techpro12*/
       /* Scanner input=new Scanner(System.in);
        System.out.println("enter user name");
        String name= input.next();

        if(name.equals("admin123")){
            System.out.println("enter mail");
            String mail= input.next();
            if(mail.equals("tech@gmail.com")) {
                System.out.println("enter password");
                String pwd= input.next();
                if(pwd.equals("techpro12*")) {
                    System.out.println("welcome");
                }else{
                    System.out.println("wrong password");
                }
            }else {
                System.out.println("wrong e mail adress");
            }
        }else{
            System.out.println("wrong user name");
        }*/

//	Write a program that takes input from the user and tell whether the input is character, vowel or not a vowel or constant
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter an alphabet");
        String a= input.next().toLowerCase();

        boolean lowerCase=a.charAt(0)<122&a.charAt(0)>97;
        boolean upperCase=a.charAt(0)<98&&a.charAt(0)>65;

        if(a.length()>1){
            System.out.println("please enter an alphabet");
        }else if(!(lowerCase||upperCase)){
            System.out.println("please enter lowercase or uppercase");
        }else if(a.equals("a")||a.equals("e")||a.equals("o")||a.equals("u")||a.equals("i")){
            System.out.println("the alphabet is vowel");
        }else{
            System.out.println("it is not vovel");
        }*/

//Home task
//	Take input from the user for a,b,c and calculate the quadratic formula and get the answer
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int a= input.nextInt();
        System.out.println("enter second number");
        int b= input.nextInt();
        System.out.println("enter thirth number");
        int c= input.nextInt();

       double x1=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        double x2=(-b+Math.sqrt(b*b-4*a*c))/2*a;

        System.out.println("x1= "+x1+" x2= "+x2);*/

/*	Write a program that takes input as an electricity unit charges from the user and calculate the total bill
according to the following conditions:

o	For the first 50 unit, $0.50/unit
o	For the next 100 unit, $0.75/unit
o	For the next 100 unit, $1.20/unit
o	Unit above 250, $1.50/unit
Also add 20% of the tax to the total bill*/

        /*Scanner input=new Scanner(System.in);
        System.out.println("enter unit number");
        int a= input.nextInt();
        double bill=0;

        if(a<51){
            bill+=a*0.5;
         } else if ((a-50)>0&&(a-50)<101) {
            bill+=25+(a-50)*0.75;
        } else if ((a-150)>0&&(a-150)<101) {
            bill+=100+(a-150)*1.20;
        } else if ((a-250)>0) {
            bill+=220+(a-250)*1.5;
        }
        double totalBill=bill+bill*20/100;
        System.out.println(totalBill);*/

//Switch Statement:
//	Write a program that takes input number from the user and tell the week day against that number
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter day number");
        int a= input.nextInt();
        String dayName="";

        switch(a){
            case 1:
                dayName="Monday";
                break;
            case 2:
               dayName="Tuesday";
               break;
               case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
                case 5:
                dayName="Friday";
                break;
            case 6:
               dayName="Saturday";
               break;
            case 7:
                dayName="Sunday";
        }
        System.out.println(dayName);*/


//Loop practice questions:
//	Write a program that takes starting and ending input number from the user and print all the range between them.
       /* Scanner input=new Scanner(System.in);
        System.out.println("enter starting number");
        int a= input.nextInt();
        System.out.println("enter ending number");
        int b= input.nextInt();

        for (int i = a; i <b+1 ; i++) {
            System.out.print(i+" ");
        }*/

//	Write a program that takes starting and ending input number from the user and print all the even numbers from the range
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter starting number");
        int a= input.nextInt();
        System.out.println("enter ending number");
        int b= input.nextInt();

        for (int i = a; i <b+1 ; i++) {

            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        Loop Practice questions:

Write a program that takes starting and ending input number
from the user and print reverse the order of that number range */
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter starting number");
//        int a= input.nextInt();
//        System.out.println("enter ending number");
//        int b= input.nextInt();
//
//        for (int i = b; i >a-1 ; i--) {
//            System.out.print(i+" ");
//
//        }


/*Write a program that take input number from the user and print its table. For example

5x1=5

5x2=10

5 x 10=50*/
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter starting number");
//        int a= input.nextInt();
//        for (int i = 1; i <11 ; i++) {
//            System.out.println(a+" x "+i+" = "+(a*i));
//
//        }

/*Write a program that takes the starting and ending number from the user and
sum the all numbers present in this range*/
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter starting number");
//        int a= input.nextInt();
//        System.out.println("enter ending number");
//        int b= input.nextInt();
//        int sum=0;
//        for (int i = a; i <b+1 ; i++) {
//           sum+=i;
//        }
//        System.out.println(sum);





    }
}
