package practice08;
public class Q05_CalculatorRunner {
    public static void main(String[] args) {
        Q05_Calculator calculator = new Q05_Calculator();
        calculator.addition(1,2,3);
        calculator.addition(0,100,-5,7);
        calculator.substract(5,4);
        calculator.multiply(2.5,6,7,99.9,0);
        calculator.multiply(1,2,3);
        calculator.divide(1,0);
        calculator.divide(5,2);

    }
}