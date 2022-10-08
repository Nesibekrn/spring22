package review.praPra;

import java.util.Scanner;

public class Pra02Done {
    public static void main(String[] args) {
        //Ask user to enter first name, middle name and last name as one single String,
        // then print the first character of middle name and last name.
        //e.g. Mark Hansel Twain==> HT

        /*Scanner input=new Scanner(System.in);
        System.out.println("Enter your firstname, middle name and lastname");
        String fullname=input.nextLine();
        String b=fullname.split(" ")[1].substring(0,1).toUpperCase();
        String c=fullname.split(" ")[2].substring(0,1).toUpperCase();
        System.out.println(b+c);*/


      /*Ask user to enter two words. If the number of characters of the first word is even,
       then put the second word into the middle of the first word.
      If the number of characters of second word is odd, then print on console
      "You can not put second word into the middle of the first word. Because it's number of character is odd.".*/
        /*Scanner input=new Scanner(System.in);
        System.out.println("enter first word");
        String a=input.next();
        System.out.println("enter second word");
        String b=input.next();
        if(a.length()%2==0){
            System.out.println(a.substring(0,(a.length()/2))+b+a.substring(a.length()/2));
        }else{
            System.out.println("You can not put second word into the middle of the first word. Because it's number of character is odd.");
        }*/


   /* A company decided to give bonus of 5% of salary to employee if his/her year of
    service is 5 and more than 5 years.
    Ask user for their salary and year of service and print the net bonus amount.
    If employee can not get bonus, print how many more years he/she should work.
    EXAMPLE:
    INPUT   :   Year    => 4 year service
                Salary  => 4000
    OUTPUT :  You need to work 1 year(s) to get bonus */
       /* Scanner input=new Scanner(System.in);
        System.out.println("enter your service year");
        int year=input.nextInt();
        System.out.println("enter your salary");
        int salary=input.nextInt();
        if(year>=5){
            System.out.println("your net bonus amount is: "+salary*5/100);
        }else{
            System.out.println("you need to work "+(5-year)+"year(s) to get bonus");
        }*/



   //Print the characters of all the numbers from 0-255 //65=A 66=B....
       /* for (int i = 0; i <256 ; i++) {
            char a=(char)i;
            System.out.print(i+"="+a+" ");
        }*/



    /*Type code to do bank transactions below at an ATM:
    Process 1: Balance inquiry
    Process 2: Money withdrawal
    Process 3: Deposit money
    Process 4: End the process */

//        Scanner input=new Scanner(System.in);
//        System.out.println("enter number of your transaction");
//        int trs=input.nextInt();
//        int balance=10000;
//        switch (trs){
//            case 1:
//                System.out.println("your balance is: "+balance);
//                break;
//            case 2:
//                System.out.println("enter amount of money you want to withdraw");
//                int withdraw=input.nextInt();
//                if(withdraw<=balance){
//                    balance-=withdraw;
//                    System.out.println("your current balance is: "+balance);
//                }else{
//                    System.out.println("not enough balance");
//                }
//                break;
//            case 3:
//                System.out.println("enter amount of money what you want to deposit");
//                int deposit=input.nextInt();
//                System.out.println("your current balance is: "+(balance+deposit));
//                break;
//            case 4:
//                System.out.println("thank you prefer us");
//                break;
//            default:
//                System.out.println("invalid number");
  //      }

   /*Ask user to enter a String and count the number of 'a's come earlier than first occurrence of 'c'.
   //Maric==>1 a before c       aaaaac===>4a before c*/

        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String a=input.next();
        int counter=0;
        for (int i = 0; i <a.length() ; i++) {
           if( a.charAt(i)=='a'){
               counter++;
           }else if (a.charAt(i)=='c'){
               break;
           }

        }System.out.println("number of a before c is: "+counter);





    }
}
