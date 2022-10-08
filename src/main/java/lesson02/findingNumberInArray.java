package lesson02;

public class findingNumberInArray {
            public static boolean containNum(int[] arr,int item) {
                for (int n : arr) {
//checking the number present or not
                    if (item == n) {
                        return true;
                    }
                }
                    return false;
                }
                public static void main(String[] args) {
                int[] num_arr = {11,22,33,44,55};
                System.out.println(containNum(num_arr,22));
        }
}
