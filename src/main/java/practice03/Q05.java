package practice03;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        /* Create an integer array by the help of user(ask user length and elements of array)
         * Ask user the index of element that user wants to remove.
         * Print the array on the console after removing
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length of the array");
        int i= input.nextInt();
        int arr[]= new int[i];
        for (int j = 0; j <i ; j++) {
            System.out.println("Enter the elements of index "+j);
            arr[j]=input.nextInt();
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("enter the index what you want to remove");
        int k=input.nextInt();
        int brr[]= new int[arr.length-1];
        int idx=0;
        for (int w = 0; w <arr.length ; w++) {
            if(w==k){
                continue;
            }else{
                brr[idx]=arr[w];
            }idx++;
        }System.out.println(Arrays.toString(brr));
    }
}
