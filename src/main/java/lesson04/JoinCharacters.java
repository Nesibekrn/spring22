package lesson04;

import java.util.Arrays;

public class JoinCharacters {
    public static void main(String[] args) {
        String[] arr = {"j","a","v","a","i","s","d","i","f","f","i","c","u","l","t"};

        System.out.println(Arrays.toString(arr));
        String str = "";
        for(String w:arr){
            str+=w;  //str = str + w;
        }
        System.out.println(str);
        String strfinal = str.replace("is","IsNot");
        System.out.println(strfinal);
    }
}
