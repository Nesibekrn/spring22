package practice06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q07 {
    /*
    Find the sum of the least and the greatest price given in a String list
    Example: List<String> myList = new List<String>{"$12.99", "$8.25", "$23.60", "54.45"}; ==> 62.70
    */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("$12.99", "$8.25", "$23.60", "$54.45");
        System.out.println(list);
        List<Double> newList=new ArrayList<>();

        for(String w:list){
            double price = Double.valueOf(w.replace("$",""));
            newList.add(price);
        }
        System.out.println(newList);
        Collections.sort(newList);
        System.out.println(newList);
        System.out.println("Sum of the least and the greatest price: "+(newList.get(0)+newList.get(list.size()-1)));

    }
}