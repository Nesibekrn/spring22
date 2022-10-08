package review.days;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day15Done {
    public static void main(String[] args) {
        //Example 4: Convert two-dimensional array to one-dimensional array
        String crr[][] = { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study",  "hard", "Alex" }};
        int elNum=0;
        for (int i = 0; i < crr.length ; i++) {
            elNum=elNum+ crr[i].length;
        }
        String copy[]=new String[elNum];
        int idx=0;
//        for (int i = 0; i < crr.length ; i++) {
//            for (int j = 0; j <crr[i].length ; j++) {
//                copy[idx]=crr[i][j];
//                idx++;
 //           }

        for (String w[]:crr){
            for (String u:w){
                copy[idx]=u;
                idx++;
            }

        } System.out.println(Arrays.toString(copy));

        //Create a list and add even integers between 13 and 51 in descending order
        //Then print the 7th element on the console
        List<Integer> me = new ArrayList<>();
        for (int i = 14; i <52 ; i++) {
            if (i%2==0){
                me.add(i);
            }

        }
        System.out.println(me.get(6));




        //Create a String list add elements into it then remove the elements end with "a" start with "M"
        List<String>sen=new ArrayList<>();
        sen.add("Maria");
        sen.add("Julia");
        sen.add("Marta");
        sen.add("Martin");
        sen.add("Jack");
        System.out.println(sen);
        for (int i = 0; i <sen.size() ; i++) {
            if (sen.get(i).startsWith("M")&&sen.get(i).endsWith("a")){
                sen.remove(i);
            }

        }
        System.out.println(sen);




       }
}
