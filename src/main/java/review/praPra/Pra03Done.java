package review.praPra;

public class Pra03Done {
    public static void main(String[] args) {
        //Print numbers from given number till the next multiple of 10.//while
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter a number");
//        int i= input.nextInt();
//        while(i%10!=0){
//                System.out.print(i+" ");
//                i++;
//            }
         /*
      Print on the console numbers from 1 to 100.
      But do not use any number in your code!
      */

//        int first='b'-'a';
//        for (int i = first; i <'e' ; i++) {
//            System.out.print(i+" ");
//
//        }


 /*
    Type code to ask user to enter an integer to check if it is 'Perfect Number' or not."
    A perfect number is a positive integer that is equal to the sum of all its proper divisors.
    6 = 1+2+3, 28 = 1 + 2 + 4 + 7 + 14, (496 and 8128)
     */
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter a number");
//        int num = input.nextInt();
//        int sum = 0;
//        for (int i = 1; i < num; i++) {
//
//            if (num % i == 0) {
//                sum += i;
//            }}
//            if (sum == num) {
//                System.out.println("Perfect Number");
//            } else {
//                System.out.println("not perfect number");
//            }


        /*
   Get the number of rows from user then draw a right triangle by using asterixs
   Number of rows = 4 ==>    *
                             * *
                             * * *
                             * * * * */
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter row number");
//        int a=input.nextInt();
//        for (int i = 0; i <a ; i++) {
//            for (int j = 0; j <i+1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

           /* Create an integer array by the help of user(ask user length and elements of array)
             * Ask user the index of element that user wants to remove.
             * Print the array on the console after removing
             */
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter arrays length");
//        int a=input.nextInt();
//        int[]arr=new int[a];
//        for (int i = 0; i <a ; i++) {
//            System.out.println("enter "+i+"st element");
//            arr[i]=input.nextInt();
//
//        } System.out.println(Arrays.toString(arr));
//        System.out.println("enter index of element you want to remove");
//        int b=input.nextInt();
//        int brr[]=new int[arr.length-1];
//        int idx=0;
//        for (int i = 0; i <arr.length ; i++) {
//            if(i==b){continue;}else{brr[idx]=arr[i];
//            idx++;}
//
//        }System.out.println(Arrays.toString(brr));

 /*
         Create a method and
		 from a given array find all pairs whose sum is a given number,
		 {4,6,5,-10,8,5,20} ===> 10
		 4 + 6 = 10
         5 + 5 = 10
        -10 + 20 = 10
		 */

        int arr[]={4,6,5,-10,8,5,20};
        add(arr,10);

    } public static void add(int []arr,int add) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == add) {
                    System.out.println(arr[i] + "+" + arr[j] + "=" + add);
                }
            }
        }
    }
}
