package practice08;

public class MarketRunner {
    public static void main(String[] args) {

        Market product1 = new Market("Milk",1.5,2);
        System.out.println("productName:"+product1.productName+" productPrice:$"+product1.productPrice+" expirationDate:"+product1.expirationDate);

        Market product2= new Market("Keyboard",10.05);

        System.out.println("productName:"+product2.productName+" productPrice:$"+product2.productPrice+" expirationDate:"+product2.expirationDate);
    }
}