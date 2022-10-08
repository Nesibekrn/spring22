package lesson02;

public class secondLargestNumFromArray {
     public static void main(String[] args) {
        int[] arr= {11,22, 33, 44, 55,66};
        int index = arr.length - 1;
        while (arr[index] == arr[arr.length-1]){
            index--;
        }
        System.out.println("Second Largest Number from Array is"+ arr[index]);
     }
}
