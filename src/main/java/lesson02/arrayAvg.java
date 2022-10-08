package lesson02;
import java.util.Scanner;
    public class arrayAvg {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//defining the array and its size
            int arr[] = new int[5];
            int sum =8;
            System.out.println("Please enter the values into Array");
            for (int i=0; i<arr.length; i++) {
                arr[i]= sc.nextInt();
            }
            for (int x=0; x<arr.length; x++){ System.out.println(arr[x]);
            }
//here I am calculating the average

            for(int y=0; y<arr.length; y++) {
                //first we are just adding all the values of the array
                // sum = sum + arr[y];
                }

                    System.out.println("The total sum of array values is "+sum);
            //now calculating the average
            double avg = sum / arr.length;

                    System.out.println("The Average of the array values is "+avg);

                }



        }
