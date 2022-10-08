package day03;

public class Day03DataTypes {
    /*
            Type Casting: Converting number primitiva data type to another number primitive data type
            byte - short - int - long - float - double
            İf you convert small data type to large data type, it is called "Auto Widening"
            İf you convert large data type to small data type, it is called "Explicit Narrowing"

            Wrapper Class: for Pr. number data types convert them non Pr.
                byte ---> Byte
                short ---> Short
                int ---> Integer
                long ---> Long
                float ----> Float
                double ----> Double
                ** char ---> Character
                boolean ---> Boolean


                Memory Useges in Java
                    There are 2types of memories in java
                    1) Stack memory: Small
                    2) Heap memory: Huge




     */
    public static void main(String[] args) {
        //Auto Widening
        byte age = 12;
        int myAge = age;

        short populationOfVillage = 21000;
        double myPopulationOfVillage = populationOfVillage;

        //Explicit Narrowing
        double x = 23.45;
        long y = (long)x;

        String name = "Mark Twein";

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length()-1);

        //Wrapper classes
        Byte yourAge = 33;
        Boolean isOld = true;

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Auto Boxing
        int a = 12;
        Integer b = a;

        //Un-Boxing
        int c = b;











    }



}
