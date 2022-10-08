package review.praPra;

import java.util.Arrays;

public class Pra04Done {
    public static void main(String[] args) {
        //Print your name without using any letter your name contains.
//        char a=78;
//        char g=101;
//        char c=115;
//        char d=105;
//        char f=98;
//        System.out.println(""+a+g+c+d+f+g);
        /* Write a Java program to take the last three characters
   from a given string and add these three characters
   at both the front and back of the string.//kahraman
//   */
//        String a="kahraman";
//        String b=a.substring(a.length()-3);
//
//        System.out.println(b+a+b);

        //Print just last two elements  (Use 'continue')
//        int arr[]={2,3,5,7};
//        for (int i = 0; i < arr.length ; i++) {
//            if(i< arr.length-2){
//                continue;
//            }else {
//                System.out.println(arr[i]+" ");
//            }
//        }

        //Print just first three elements (Use 'break')
//        int arr[]={2,3,5,7};
//        for (int i = 0; i < arr.length ; i++) {
//            if(i<3){
//                System.out.println(arr[i]+" ");
//            }else{
//                break;
//            }
//        }

        //Print the elements from index 2 to index 4 (Use 'continue' and 'break')
//        int arr[]={0,1,2,3,4,5,6};
//        for (int i = 0; i < arr.length ; i++) {
//            if(i<2){
//                continue;
//            } else if (i==5) {
//                break;
//            }else{
//                System.out.print(arr[i]+" ");
//            }
//        }

  /*
      Type code to ask user to enter the number of row
      and print the shape below according to that number:
       1
       2 3
       4 5 6
       7 8 9 10
       11 12 13 14 15
       16 17 18 19 20 21
       */
//        int a=0;
//        for (int i =1; i <5 ; i++) {
//            for (int j =0; j <i; j++) {
//                System.out.print(++a+" ");
//            }
//            System.out.println();
//        }
        //Type a code to change the sign(+-) of the elements in a given array.(for each)
        // input : 1,2,-3,4,-5,-6
        //output :-1,-2,3,-4,5,6

//        int arr[]={1,2,-3,4,-5,-6};
//        int brr[]=new int[arr.length];
//        int idx=0;
//        for(int w:arr){
//            brr[idx]=w*-1;
//            idx++;
//        }
//        System.out.println(Arrays.toString(brr));

 /*
       Type code to find the minimum, maximum and second-maximum number in the array?
       input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
       output: min:-90, max:10001, secMax: 8787(without sort)(for each)
      */

//        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
//        int max=0;
//        int sMax=0;
//        int min=arr[0];
//        for (int w:arr) {
//            if(w<min){
//                min=w;
//            } else if (w>max) {
//                max=w;
//            } else if (w>sMax&&w<max) {
//                sMax = w;
//            }
//       }
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(sMax);

//Type code to print the elements of an array those are greater than average.
//        int[] arr={5, 9, 15, 1, 0, 11, 3};
//        int sum=0;
//        for (int u:arr) {
//           sum+=u;
//        }
//        for(int w:arr){
//            if(w>sum/ arr.length){
//                System.out.print(w+" ");
//            }
//        }
 /*
        Write code to find the sum of the dollars and sum of the euros in the given string.
         */
//        String s = "$1 $12 €34 €56 $45 €78";
//        String arr[]=s.split(" ");
//        System.out.println(Arrays.toString(arr));
//        int sumDolars=0;
//        int sumEuros=0;
//        for(String w:arr){
//            if(w.contains("$")){
//              sumDolars+=Integer.valueOf(w.replace("$",""));
//            }
//            if(w.contains("€")){
//                sumEuros+=Integer.valueOf(w.replace("€",""));
//
//            }
//
//        }System.out.println(sumDolars+" "+sumEuros);



 /*
   Type code to calculate the sum of the numbers for each inner arrays in
   a multidimensional array and print them on console as single-dimensional array.
   input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}
   */
     int[][]arr={{10,20,30},{4},{6,7,20}};
     int[]brr=new int[arr.length];

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                brr[i]+=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(brr));
    }
}
