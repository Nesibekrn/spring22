package lesson04;

interface AnimalInfo{
    void eat();
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("Monkey is jumping..");
    }
    void bite(){
        System.out.println("Monkey is biting..");
    }
}

class Human extends Monkey implements AnimalInfo{

    void speak(){
        System.out.println("Hello, how are you!");
    }
    @Override
    public void eat() {
        System.out.println("Eating..");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping..");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();

        AnimalInfo an = new Human();
        an.eat();
        an.sleep();
    }
}
