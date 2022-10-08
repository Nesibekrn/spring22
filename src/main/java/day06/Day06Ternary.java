package day06;

public class Day06Ternary {
    public static void main(String[] args) {
        //Type code to check if a number is positive or not
    int x = -12;
    //1.Way: By using if-else
        if(x>0){
            System.out.println("Positive");
        }else{
            System.out.println("Not Positive");
        }

        //2.Way: By usingternary
        String result = x>0 ? "Positive" : "Not Positive";
        System.out.println(result);
        //Type code to check if an integer has 3 digits or not
        int y = -135;
        int absY = Math.abs(y);

        //Using '>' is better than using '>=' because there is single condition in the first
        String result2 = (1000>absY  && absY>99) ? "3 Digits" : "Not 3 Digits";
        System.out.println(result2);

        //Type code to check following conditions for state abbreviations in the USA
        //1)It should have 2 characters     2)It should have just uppercase
        String s = "FKL";
        String result3 = s.length()==2 && s.replaceAll("[A-Z]","").length()==0 ? "Valid abbreviation": "İnvalid abbreviation";
        System.out.println(result3);
    }
}
