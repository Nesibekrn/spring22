
package day17;

public class StaticKeyword01 {

        /*
            Question 1: How do you use non-static things inside the "main" method?
                        There are 2 ways;
                        i)Make it static
                        ii)Create an object then by the help of the object
                           use it in "main" method
            Question 2: How do you access to static and non-static things from outside the class?
                        i)Just Class Name is enough to access static things
                        ii)You have to create object to access non-static things
         */

    public static int sCounter = 0;
    public int counter = 0;

    public StaticKeyword01(){
        sCounter++;
        counter++;
    }

    public static void main(String[] args) {

        StaticKeyword01 obj1 = new StaticKeyword01();
        StaticKeyword01 obj2 = new StaticKeyword01();
        StaticKeyword01 obj3 = new StaticKeyword01();

        System.out.println(sCounter);//3
        System.out.println(obj1.counter);//1
        System.out.println(obj2.counter);//1
        System.out.println(obj3.counter);//1
    }
} /*The things like Moon in Java is called “static”;
        1)”static” things are common for all objects
        2)Any update on “static” things will effect all objects and will be visible by all objects.
    when those objects are created java will go to constructor and make object will be related that objects typed in main method*/