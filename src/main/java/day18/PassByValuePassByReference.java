package day18;
/*1)Java creates copy of values in method calls to protect original value of the variables.
        That process is called "Pass By Value".
        2)By the help of the "Pass By Value", we are able to protect original value.
        3)Some programming languages may use "Pass By Reference", if you use that kind of languages be careful about
        protecting original values.*/

public class PassByValuePassByReference {
    public static void main(String[] args) {
        int shirt=100;
        System.out.println(doDiscount("veterans",shirt));
        System.out.println(doDiscount("students",shirt));
        System.out.println(doDiscount("seniors",shirt));

        String greeting="Wooow";
        System.out.println(addExclamationMark(greeting));
        System.out.println(greeting);
    }
    public static int doDiscount(String status,int price){
        switch (status){
            case "students":
                price=price-10;
                break;
            case
            "veterans":
            price=price-20;
            break;
            case "seniors":
                price=price-5;
                break;
            default:
                price=price;

        }
        return price;
    }

    public static String addExclamationMark(String greetings){
        return greetings+"!";
    }
}
