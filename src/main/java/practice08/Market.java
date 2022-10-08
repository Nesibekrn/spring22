package practice08;

import java.time.LocalDate;

public class Market {
    //Type a supermarket program to see product name, product price and expiration date.

    String productName;
    double productPrice;
    String expirationDate;

    Market(String proName, double proPrice, int monthLater ){
        productName=proName;
        productPrice=proPrice;
        expirationDate=LocalDate.now().plusMonths(monthLater).toString();

    }

    Market(String proName, double proPrice){
        productName=proName;
        productPrice=proPrice;
        expirationDate="This product does not have any expiration date!";
    }
}