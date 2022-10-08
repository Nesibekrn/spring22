package day04;

public class Day04Operations {

/*
    Operations Java
    1) +, -, *, /
        Order of operations
    2) İncrement and Decrement opretations
        to increase ====> +, *
        to decrease ====> -, /
    3) Comparison Operators
       >, <, >=, <=, ==, !=




     */

    public static void main(String[] args) {
       int result = 10-6/(2+5/5)+7;
        System.out.println(result);

        //Increment
        int a = 12;
        a+=3;
        System.out.println(a);

        int b=4;
        b*=3;
        System.out.println(b);

        //Decrement
        int c = 18;
        c-=3;
        System.out.println(c);

        int d=24;
        d/=6;
        System.out.println(d);

        //Increment and decrement by 1
        int e=12;
        e=e+1;
        e+=1;
        e++;
        System.out.println(e);

        int f=13;
        f=f-1;
        f-=1;
        f--;
        System.out.println(f);

        //Comparison Operators
        int h=12;
        int i=13;
        System.out.println(h<i);//true
        System.out.println(h==i);//false
        System.out.println(h<=i);//true
        System.out.println(h!=i);//true



        //All comperation operations return boolean

        /*4)Logical Operators
            i)AND Operator: &&==> This operator is used between two boolean values
                true && true ==> true
                true && false ==> false
                false && true ==> false
                false && false ==> false
         */

        System.out.println(3<4 && 5>1);
        System.out.println(3>4 && 5>1);
        System.out.println(3<4 && 5>1);
        System.out.println(3>4 && 5<1);



        /*
        ii) Or Operation: ===> this operation is used between two boolean values
                   true || true ==> true
                   true || false ==> true
                   false || true ==> true
                   false || false ==> false

         */

        //post-increment and pre-increment

        int x =12;
        int y =x++;
        System.out.println(y); //post so 12
        System.out.println(x); // x increased so 13

        int m = 12 ;
        int n = ++m ;
        System.out.println(n); //pre so 13
        System.out.println(m); // m increased so 13


    }



}
