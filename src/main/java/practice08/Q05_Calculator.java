package practice08;
public class Q05_Calculator {
      /*
    Create a basic calculator, create add, subtract, multiply, divide methods.
     */
    public void addition(double... a){
        double sum=0;
        for(double w:a){
            sum+=w;
        }
        System.out.println("The sum is "+sum);

    }
    public void substract(double a, double b){
        System.out.println("The difference is "+(a-b));
    }
    public void multiply(double... a){
        double product=1;
        for(double w:a){
            product *=w;
        }
        System.out.println("The product is "+product);
    }
    public void divide(double a, double b){
        if(b==0){
            System.out.println("Second parameter can not be 0");
        }else {
            System.out.println("Result of division "+(a/b));
        }
    }
}