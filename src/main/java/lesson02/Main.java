package lesson02;
import java.util.Arrays;
    public class Main {
        public static void main(String[] args) {
            int[] arr = {11, 22, 33, 44, 55};
//System.out.println(Arrays.toString(arr));
/*for(int x: arr) {
            System.out.println(x);
}*/
            for (int x = 0; x < arr.length; x++) {
                System.out.println(arr[x]);
            }
        }
}
