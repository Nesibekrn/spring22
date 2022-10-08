package review.praPra;

import java.util.*;

public class Pra11Done {
      /*
        Write a method which prints the numbers from 1 to 30 but for numbers which are a multiple of 3,
        print Rock instead of number and for numbers which are a multiple of 5, print Star instead of the number.
        For numbers which are a multiple of both 3 and 5, print RockStar instead of the number.

            INPUT     : 1 2 3 4 ..... 30
            OUTPUT : 1 2 Rock 4 Star Rock 7 8 Rock Star 11 Rock 13 14 RockStar...*/
//      public static void main(String[] args) {
//          rockstar();
//      }
//            public static void rockstar(){
//                for (int i = 1; i <31 ; i++) {
//                    if (i%3==0&&i%5!=0){
//                        System.out.print("Rock ");
//                    }else if (i%5==0&&(i&3)!=0){
//                        System.out.print("Star ");
//                    }else if (i%15==0){
//                        System.out.print("rockstar ");
//                    }else {
//                        System.out.print(i+" ");
//                    }
//                }
//            }

         /*    Type code to print shape below:
                  1 2 3 4 5 6
                   2 3 4 5 6
                    3 4 5 6
                     4 5 6
                      5 6
                       6     */
//         public static void main(String[] args) {
//             for (int i = 1; i < 7; i++) {
//                 for (int k =1; k <i ; k++) {
//                         System.out.print(" ");
//                 }
//                 for (int j = i; j <7 ; j++) {
//                     System.out.print(j+" ");
//                 }
//                System.out.println();
//             }
//         }

       //  Create a method to take a six element array from user and put the odd numbers into a list and print it.
//       public static void main(String[] args) {
//           Scanner input=new Scanner(System.in);
//           int arr[]=new int[6];
//           for (int i = 0; i < arr.length ; i++) {
//               System.out.println("Enter element of index "+i);
//               arr[i]= input.nextInt();
//           }
//           printList(arr);
//       }
//       public static void printList(int arr[]){
//           List<Integer> aList=new ArrayList<>();
//           for (int a:arr){
//               if (a%2!=0){
//                   aList.add(a);
//               }
//           }
//           System.out.println(aList);
//       }

     /* Print two arrays which contains firstname and lastname as the format : firstname=lastname
          input : ["John", "Mark", "Ali"]; ["Doe", "Twain", "Can"];
          output : {John=Doe, Mark=Twain, Ali=Can}; with Map*/
//     public static void main(String[] args) {
//         String arr1[]={"John", "Mark", "Ali"       };
//         String arr2[]={"Doe", "Twain", "Can"};
//         Map<String,String>nSN=new TreeMap<>();
//         for (int i = 0; i < arr1.length ; i++) {
//             nSN.put(arr1[i],arr2[i]);
//         }
//         System.out.println(nSN);
//     }

   /*  * Type a program that displays all the 7-day earnings of the market on a daily basis.
     - Type a method that calculate the average amount the market earns this week.
     - Type a method that calculate which days market earns above average.
     - Type a method that calculate which days market earns below average. with list
        Step 1 : Create an ArrayList containing the days.
        Step 2 : Create an ArrayList to which we will add the daily earnings.
        Step 3 : With the while loop, take the 7-day earnings from the user one by one and add them to the daily earnings ArrayList.
        Step 4 : Get the average earnings with the method called averageOfEarnings().
        Step 5 : Create a method called daysAboveAverage().
                 Compare all days with average earnings with for loop
                 If higher than average earnings, return those days.
        Step 6 : Create a method called daysBelowAverage().
                 Compare all days with average earnings with for loop
                 If less than average earnings, return those days.*/

//  static double totalearning;
//  static double average;
//  static List<String> days=new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
//  static List<Double> earn=new ArrayList<>();
//   public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//       for (int i = 0; i <7 ; i++) {
//           System.out.println("Enter earn of "+ days.get(i));
//           double a=input.nextDouble();
//            earn.add(a);
//            totalearning+=(earn.get(i));
//       }
//       System.out.println("Daily earning: "+earn);
//       System.out.println("Total earning: "+totalearning);
//       calcAverage();
//       aboveEarning();
//       beloveEarning();
//     }
//     public static void calcAverage(){average=totalearning/7;
//         System.out.println("Average of earnin: "+average);}
//
//    public static void aboveEarning(){
//        System.out.print("Above days of average: ");
//        for (int i = 0; i <7 ; i++) {
//            if (earn.get(i) > average) {
//                System.out.print(days.get(i) + " ");
//            }
//        }
//        System.out.println();
//    }
//    public static void beloveEarning(){
//        System.out.print("Belove days of average: ");
//        for (int i = 0; i <7 ; i++) {
//            if (earn.get(i) <= average) {
//                System.out.print(days.get(i) + " ");
//            }
//        }
//    }

   /* Create a method to count the number of  each words in a String one by one.
    input: "Ali came to school and Ayse came to school"
    output: Ali = 1 came = 2 to= 2 school= 2 and= 1 Ayse= 1 */
   public static void main(String[] args) {
       String a="Ali came to school and Ayse came to school";
       countWord(a);
   }
    public static void countWord(String str){
        String srr[]=str.split(" ");
        Map<String,Integer>output=new TreeMap<>();
        for (String w:srr){
            if (output.containsKey(w)){
                output.put(w,output.get(w)+1);
            }else {
                output.put(w,1);
            }
        }
        System.out.println(output);
    }
}
