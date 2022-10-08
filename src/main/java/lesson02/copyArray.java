package lesson02;
import java.util.Arrays;
public class copyArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int brr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            brr[i] = arr[i];
        }
        System.out.println(Arrays.toString(brr));
    }
}
