package review.days;

import java.util.HashMap;
import java.util.Map;

public class Day27Done {
    public static void main(String[] args) {
        //Type code to find the number of occurrences of letters in a String
        //"toms are phantoms." ==> t=2 o=2 m=2 s=2 a=2 r=1 e=1 p=1 h=1 n=1

        String s="123? + tomaas are phassntoms.";
        String nS=s.replaceAll("[^a-zA-Z]","");
        System.out.println(nS);
        String []srr=nS.split("");
        Map<String,Integer> result=new HashMap<>();

        for (String w:srr){
            Integer numOfOcuurence=result.get(w);
            if (result.get(w)==null){
                result.put(w,1);
            }else{
                result.put(w,numOfOcuurence+1);
            }
        }
        System.out.println(result);
    }
}
