package practice04;
import java.util.Arrays;
public class Q06 {
    /*
       Type code to find the minimum, maximum and second-maximum number in the array?
       input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
       output: min:-90, max:10001, secMax: 8787
      */
    public static void main(String[] args) {
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
        //1st way:
        //  Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println("min:"+arr[0]+" max:"+arr[arr.length-1]+" secMax:"+arr[arr.length-2]);
        //2nd:
        int min=0;
        int max=0;
        int secMax=0;
        for(int w:arr){
            if(w<min){
                min=w;
            }
            if(w>max){
                secMax=max;
                max=w;
         }
//            else if (w>secMax) {
//                secMax=w;
//            }
        }
        System.out.println("min:"+min+" max:"+max+" secMax:"+secMax);
    }
}