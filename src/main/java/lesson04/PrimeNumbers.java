package lesson04;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> primeNumbers = new ArrayList<>();
        int num = 2;
        int counter = 0;
        while(num<100){
            for(int i=2; i<=num; i++){
                if(num%i == 0){
                    counter++;
                }
            }
            //also need to add into ListArray
            if(counter==1){
                primeNumbers.add(num);
            }
            num++;
            counter=0;
        }
        System.out.println("Prime numbers from range 1 to 100 "+primeNumbers);
    }
}
