package practice08;
import java.util.Arrays;
public class Q02 {
    /*
     * create a method accepts a name as parameter
     * and prints the name as a char array
     *
     * (do not use toCharArray() method)
     *
     * Input : John
     * Output : [J, o, h, n]
     */
    public static void main(String[] args) {

        System.out.println(Arrays.toString(charArray("John")));

    }
    public static char[] charArray(String str){
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        return arr;
    }
}