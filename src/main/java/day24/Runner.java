package day24;
public class Runner {
    public static void main(String[] args) {
        System.out.println(HondaAc.price);//890
        System.out.println(HondaEngine.price);//2890
        System.out.println(HondaSecurity.price);//90
        System.out.println(HondaAc.make);
        System.out.println(HondaEngine.isOld);
        System.out.println(HondaSecurity.i);
        //When you create a method with body by using
        // "static" keyword, you can access to it by
        // using just the interface name
        HondaAc.climateCool();
        //When you create a method with body by using
        // "default" keyword, you can access to it by
        // using object
        Civic civic = new Civic();
        civic.bacteriaKiller();
    }
}