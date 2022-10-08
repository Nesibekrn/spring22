package practice07;
//Check if a String is palindrome or not.
public class Q01 {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder("12321");
        String str=sb1.toString();
        String reversed =sb1.reverse().toString();
        System.out.println("Is String palindrome?- "+str.equals(reversed));
  }
   }
