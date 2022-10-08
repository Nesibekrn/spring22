package day02;

import java.sql.SQLOutput;

public class Day02Variables {

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);




       char initial = 'S';
        // Dont forget to put value between single quotes
        //default value of char is ' ';

        boolean isOld = true;
        boolean isAlive = false;
        //default value of boolean is "false"


        byte ageOfStd = 13;

        short populationOfVilige = 21000;

        long populationOfWorld = 1000000000;

        long populationOfWorl =  765L;
        //dont forget to put L to the end whem you create a long variable

    }

          // Data type - Variable Name - Equal Sign - Value - Semi Colon
       static   int          age              =        12        ;

     static int height = 183;

    public static double weight = 85.7;

    // Note: if you dont type any access modifier, it means the access modifier is "default"
    /*
        ********  Data Types in java   ********
    1) Primitive Data Types:
        i) Those data types were created by java, we cannot create anu primitive data type
        ii) Primitive Data Types are 8 ===!!
             byte     /      short        /           int         /             long
        -128 to 127      -32... to 32...    -2billion to 2billion    >2billion to <-2billion
    for whole numbers   for whole numbers      for whole numbers        for whole numbers

    /      float           /           double-
          decimals                     decimals
   less memoruy vs. double
   at the end use "F"or "f"
  7 digits at most in decimal      16 digits atmost in decimal

           char / boolean
           !,?      T,F



    2) Non primitive Data Types
        i) Those data types can be created by java and by java developer
            no limit
            String ; for multiple characters - must use ""

      Note: what is the diffirence between "pirimative" and "non pirimative" data types
            there are 4 main diffirences
            * Primitive ==> start with lowercases - non Primitive ==>  start with uppercases
            * Pr==> created by just java             - n.Pr ==> create by java and java developer
            * Pr==>> use different size              - n.Pr ==> use memory same
            * *** Pr ==> have values in it           - n.Pr==> have "values" and "methods"
            *
            *
     */

    String nameOfStd = "Mark Twain";
    String stdId = "Mt2022_01";





}
