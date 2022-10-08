package day02;

public class Day02MethodCreation {

    public static void main(String[] args) {

        System.out.println(addIntegers(12,5));

        System.out.println(multiplyIntegers(8,5));

        System.out.println(subtractIntegers(12,7));

        System.out.println(divideIntegers (24.6,2));


    }
    //Create an addition method
    public static int addIntegers(int a, int b){

        return a + b;

    }

    //Create a multiplication method

    public static int multiplyIntegers(int a, int b){


        return a * b;

    }

    public static int subtractIntegers(int a, int b){

    return a - b;

    }

    public static double divideIntegers (double a, int b){

        return a / b;


    }

    //Note 1: if you use same data types for all values in a mathematical operation,
    // the result will be in the same data type

    //Note 2: if you use different dta types in a mathematical operation,
    // the result will be in the largest data type. example; double / int ===>> double

    /*

    what did we learn so far?
    1)how to create dynamic methods.
    2)how to use a method in "main method"
    3)how to print the result of the method on the console
    4)how to decide return type when you create a method.
    5)how to work data types in mathematical operations
     */

}