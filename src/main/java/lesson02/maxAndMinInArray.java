package lesson02;
public class maxAndMinInArray {
    public int func_max(int arr1[]) {
        int max = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        return max;
    }

    public int func_min(int arr1[]) {
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr1 = {12, 33, 4, 24, 72, 8, 99};
        //making an object of the class
        maxAndMinInArray m = new maxAndMinInArray();
        System.out.println("Miximum value from array is " + m.func_max(arr1));
        System.out.println("Minimum value from array is " + m.func_min(arr1));
    }
}
