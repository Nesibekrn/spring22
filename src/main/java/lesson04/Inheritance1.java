package lesson04;

class Person{
    public void voice(){
        System.out.println("I am a person");
    }
}

class Animal extends Person{
    public void voice(){
        System.out.println("I am Animal");
    }
}
public class Inheritance1 {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.voice();
    }
}
