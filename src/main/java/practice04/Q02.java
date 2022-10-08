package practice04;
public class Q02 {
    /* Write a Java program to take the last three characters
   from a given string and add these three characters
   at both the front and back of the string.
   */
    public static void main(String[] args) {
        String str="Johnie Doe";
        String lastThreeChars=str.substring(str.length()-3);
        System.out.println(lastThreeChars);
        System.out.println(lastThreeChars+str+lastThreeChars);
    }
}