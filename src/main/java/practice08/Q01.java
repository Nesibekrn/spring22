package practice08;

public class Q01 {
    /*
      Create a method that adds given integers except the first one and multiplies the sum by the first integer.
       */
    public static void main(String[] args) {

        method(2,5,6);
        method(0,3,5,7,9);
        method(1, 1,2,3);
        method(5);

    }

    public static void method(int a, int... numbers){
        int sum = 0;
        for(int w:numbers){
            sum+=w;
        }
        int result = a * sum;
        System.out.println(result);
    }
}