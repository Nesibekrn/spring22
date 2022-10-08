package review.praPra;

import java.util.*;

public class Pra06Done {

     /*
  Ask user to enter an integer and Print 'Even' for even integers,
  increase  the value by 3 for odd integers and print it on console by using ternary.
   */
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("enter an integer");
//         int a=input.nextInt();
//         String str = a%2==0 ? "even": String.valueOf(a+3);
//         System.out.println(str);
//     }
    /*
     * Type code to find the common elements between two String Arrays
     * (without case sensitivity-not uppercase/lowercase sensivity) put them in a list

     * Input1 : {John,Brad,Angel,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}

     * Output : [brad,sofia,emily]
     */
//     public static void main(String[] args) {
//    String arr[]={"John","Brad","Angel","Sofia","Emily"};
//    String brr[]={"sofia","brad","grace","emily","hazel"};
//         List<String>crr=new ArrayList<>();
//    for(String w:arr){
//        for (String u:brr){
//            if(w.equalsIgnoreCase(u)){
//                crr.add(u);
//            }
//        }
//    }
//         System.out.println(crr);
//}
    /*
   - Type code to ask user to enter the int elements and add elements into the list
   - Ask user to enter the elements to remove, then remove that element from list.
   - Ask user to enter the element to update, then update it.
    */
//     public static void main(String[] args) {
////     Scanner input = new Scanner(System.in);
////         List<Integer> brr=new ArrayList<>();
////     while (true){
////         System.out.println("to add element type 'add'"+"\n" +
////                             "to remove element type 'remove"+"\n" +
////                            "to update element type 'update'"+"\n" +
////                 "To quit type 'quit'");
////         String acc=input.next();
////         if(acc.equals("add")){
////             System.out.println("enter element you want to add");
////             int a=input.nextInt();
////             brr.add(a);
////         }else if (acc.equals("update")) {
////             System.out.println("enter  element you want to update");
////             int c= input.nextInt();
////             System.out.println("enter element you want to put");
////             int d= input.nextInt();
////             brr.set(brr.indexOf(c), d);
////             System.out.println(brr);
////         } else if (acc.equals("remove")) {
////             System.out.println("type element what you want to remove");
////             int b=input.nextInt();
////             brr.remove((Integer)b);
////             System.out.println(brr);
////         } else if (acc.equals("quit")){
////             break;
////         }else{
////             System.out.println("enter a valid option");
////         }
////         System.out.println(brr);
////     }
////         System.out.println("good bye");
////}
     /*
    Type a code to display the number of days in a given month of a given year.
        Example: The number of days in February 2000 was 29.You calculate which month is 31 which ia 30 which is 29
    */
//     public static void main(String[] args) {
//     int year=2004;
//     int month=2;
//     int day=0;
//     switch(month){
//         case 1:
//         case 3:
//         case 5:
//         case 8:
//         case 10:
//         case 12:
//             day=31;
//             break;
//         case 4:
//         case 6:
//         case 7:
//         case 9:
//         case 11:
//             day=30;
//             break;
//         case 2:
//             if((year%100!=0&&year%4==0)||year%400==0){
//             day=29;
//         } else {
//             day=28;
//         }
//             break;
//         default:
//             System.out.println("invalid month name");
//             break;
//     }
//         System.out.println(day);
//     }
    /*
   If the list has 15 as element, change all 15s to 51
   Example: (12, 11, 15, 34, 43) ==> Output is (12, 11, 51, 34, 43)
   */
//     public static void main(String[] args) {
//         List<Integer> arr=new ArrayList<>();
//         arr.add(12);
//         arr.add(11);
//         arr.add(15);
//         arr.add(34);
//         arr.add(43);
//         arr.add(15);
//         arr.add(75);
//         arr.add(15);
//         System.out.println(arr);
//         if(arr.contains(15)){
//             for(int w:arr){
//                 if(w==15){
//                arr.set(arr.indexOf(15),51);}}
//         }else{
//             System.out.println("not existing element");
//         }
//         System.out.println(arr);
//     }
    /*
        Find the middle element in an integer array
       Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
       (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
    */
//    public static void main(String[] args) {
//        int arr[]={12, 5, 8};
//        int brr[]={12, 5, 8, 13};
//        System.out.println(middle(arr));
//    }
//    public static int middle(int []arr){
//        int mid=0;
//        Arrays.sort(arr);
//        if(arr.length%2==0){
//             mid=(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
//        }else{
//            mid=arr[(arr.length-1)/2];
//        }
//        return mid;
//    }
    /*
    Find the sum of the least and the greatest price given in a String list
    Example: List<String> myList = new List<String>{"$12.99", "$8.25", "$23.60", "54.45"}; ==> 62.70
    */
     public static void main(String[] args) {
         List<String> myList = new ArrayList<>();
         List<Double> prc=new ArrayList<>();
         myList.add("$12.99");
         myList.add("$8.25");
         myList.add("$23.60");
         myList.add("$54.45");
         System.out.println(myList);
        for(String w:myList){
            double u=Double.valueOf(w.replace("$",""));
            prc.add(u);
        }
         System.out.println(prc);
         Collections.sort(prc);
         System.out.println(prc);
         System.out.println(prc.get(0)+prc.get(prc.size()-1));
     }
}
