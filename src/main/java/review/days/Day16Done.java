package review.days;

import java.util.ArrayList;
import java.util.List;

public class Day16Done {
    public static void main(String[] args) {


    //Create an integer list, add 5 elements in it, remove the even elements, change the odd elements to 22
    //[12, 3, 7, 24, 11] ==> [22, 22, 22]
//    List<Integer> ket=new ArrayList<>();
//    ket.add(12);
//    ket.add(3);
//    ket.add(7);
//    ket.add(24);
//    ket.add(11);
//        for (int i = 0; i < ket.size() ; i++) {
//            if (ket.get(i)%2==0){
//                ket.remove(i);
//                i--;
//            }else {
//                ket.set(i,22);
//            }
//        }
//        System.out.println(ket);


    //Create an integer list which has repeated elements then remove the duplicates
    //[2, 3, 2, 2, 4] ==> [2, 3, 4]
        List<Integer>hey=new ArrayList<>();
        hey.add(2);
        hey.add(3);
        hey.add(2);
        hey.add(2);
        hey.add(4);
        List<Integer>hay=new ArrayList<>();
        for (int w:hey){
            if (!hay.contains(w)){
                hay.add(w);
            }
        }
        System.out.println(hay);


}
}