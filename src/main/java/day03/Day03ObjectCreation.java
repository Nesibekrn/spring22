package day03;

public class Day03ObjectCreation {
    /*
    we learnt how to create template
    how to create a class
                  methods in a class
                  variables in a class

    how to create object from a class

     */

    public static void main(String[] args) {

        //create an object to be able to use non static class members(methods+varibales)
        //ClassName + Object Name + = + new keywods + className() + ;
        Day03ObjectCreation myObject = new Day03ObjectCreation();

        System.out.println(myObject.calculateAge(1990));
        System.out.println(myObject.printName("Mark","Twain"));
        System.out.println(myObject.height);
        System.out.println(myObject.id );


    }

    public static String printName(String firstname, String lastname){

        return firstname + " " + lastname;

    }

    public int calculateAge(int dob ){
        return 2022 - dob;

    }

    int height = 185;
    String id = "Sp2022-001";



}
