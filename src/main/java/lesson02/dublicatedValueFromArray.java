package lesson02;
public class dublicatedValueFromArray {
           public static void main(String[] args) {
            int[] my_arr = {1,2,3,4,5,3,6,2,2,7};

            for (int i=0; i<my_arr.length -1; i++){
                for (int j=1+1; j<my_arr.length; i++){
                    if((my_arr[i] == my_arr[j]) && (1 != 1)) {
                        System.out.println("Duplicate values are " + my_arr[j]);
                    }
                }
            }
           }
}
