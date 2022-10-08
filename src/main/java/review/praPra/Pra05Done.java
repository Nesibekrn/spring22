package review.praPra;

public class Pra05Done {
    //Type code to calculate house budget and house members' own budgets.

    //Create a method to print "Mark" on console by picking the characters from the "alphabet string".
//    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//    public static void main(String[] args) {
//        System.out.println(name("M","A","R","K"));
//    }
//    public static String name(String s1,String s2,String s3,String s4){
//       Pra05 obj=new Pra05();
//       String alph= obj.alphabet;
//      char ch1=alph.charAt(alph.indexOf(s1));
//       char ch2=alph.toLowerCase().charAt(alph.indexOf(s2));
//       char ch3=alph.toLowerCase().charAt(alph.indexOf(s3));
//      char ch4=alph.toLowerCase().charAt(alph.indexOf(s4));
//       return ""+ch1+ch2+ch3+ch4+" Twain";
//    }

     /*
        Create  a method to ask user to enter two strings and check them if they are "Anagram" or not.
         ===Interview Question===
        * Anagram is to create a new word from other word's characters.
        * Write java code to check if two words are anagram or not
        * isAnagram("listen", "Silent") ==> anagram
        * Dormitory = Dirty room
        * School master = The classroom
        * Conversation = Voices rant on
        * Listen = Silent
        * Astronomer = Moon starer
        */

//        public static void main(String[] args) {
//        Scanner input =new Scanner(System.in);
//        System.out.println("enter first word");
//        String word1=input.next();
//        System.out.println("enter second word");
//        String word2=input.next();
//
//        isAnagram(word1,word2);
//    }
//
//    public static void isAnagram(String str1,String str2){
//        String s1[]=str1.toLowerCase().replaceAll(" ","").split("");
//        String s2[]=str2.toLowerCase().replaceAll(" ","").split("");
//        Arrays.sort(s1);
//        Arrays.sort(s2);
//        if(Arrays.equals(s1,s2)){
//            System.out.println("yes anagram");
//        }else {
//            System.out.println("not anagram");
//        }
//    }

    /*
     * Create an integer array with 5 elements
     * Convert to a list
     * Add 11, and 13 into the list, 11 will be at the beginning, 13 will be at index 3
     * Increase the value of every element by 3
     * Print the multiplication of the elements from index 2 to index 5
     */
//    public static void main(String[] args) {
//    Integer arr[]={5,9,1,7,5};
//    List<Integer> brr=new ArrayList<>();
//    for(int w:arr){
//        brr.add(w);
//    }
//        System.out.println(brr);
//    brr.add(0,11);
//    brr.add(3,13);
//        for (int i = 0; i <brr.size() ; i++) {
//            brr.set(i,(brr.get(i)+3));
//        }
//        System.out.println(brr);
//        int sum=1;
//        for (int i = 2; i <5 ; i++) {
//            sum*=brr.get(i);
//        }
//        System.out.println(sum);

//}
     /*		Create a method that puts a multidimensional array into a list then print elements in alphabetical order.
          Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
             Output: [Ali, Ayse, Can, Hasan, Suzan, Veli]
   */
//public static void main(String[] args) {
//    String arr [][]={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
//    System.out.println(b(arr));
//}
//    public static List b(String[][]mda) {
//        List<String> arrList = new ArrayList<>();
//        for (String[] w : mda) {
//            for (String u : w) {
//                arrList.add(u);
//            }
//        }
//        Collections.sort(arrList);
//        return arrList;
//    }
}
