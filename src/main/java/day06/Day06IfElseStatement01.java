package day06;

import java.util.Scanner;

public class Day06IfElseStatement01 {
    /*
    ıf the score is less then 50 then you will fail.
    ıf the score is grater then or equal 50 then you will pass.

    ıf the score is less then 50 then you will fail otherwise you will pass.
     */
    public static void main(String[] args) {
/*Ask user to enter the score, if the score is less than 50 print "Fail",
otherwise print "Pass" on the console.
 */
        //1.Way; Recommended
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();

        if(score<50){
            System.out.println("Fail");
        }else{
            System.out.println("Pass");

        }
        //2.way: multiple if,not recommended
        if(score<50){
            System.out.println("Fail");
        }
        if(score>=50){
            System.out.println("Pass");
        }
        //Ask user to enter the number of day, then print the name of the day whose number was given
        //Example: 2 ==> Monday, 5 ==> Thursday
        System.out.println("Enter day number");
        int dayNum = input.nextInt();

        if(dayNum==1){
            System.out.println("Sunday");
        }else if(dayNum==2){
            System.out.println("Monday");
        }else if(dayNum==3){
                System.out.println("Tuesday");
        }else if(dayNum==4){
            System.out.println("Wednesday");
        }else if(dayNum==5){
            System.out.println("Thursday");
        }else if(dayNum==6){
            System.out.println("Friday");
        }else if(dayNum==7){
            System.out.println("Saturday");
        }else {
            System.out.println("Please enter a valid number");
        }






            }
}
