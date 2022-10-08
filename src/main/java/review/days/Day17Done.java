package review.days;

import java.time.LocalDate;

public class Day17Done {

          /*
       Create unique student ids for every registered student
       Tom Hanks registered to Math Course(901) ==> TH20229011001
    */
    public static int counter=1000;

    public Day17Done(){
        counter++;
    }
    public static String setStdId(String name, String lesson){
        String n1=name.toUpperCase().substring(0,1);
        String n2=name.toUpperCase().split(" ")[1].substring(0,1);

        int year=LocalDate.now().getYear();

        int code=0;
        switch (lesson){
            case "math":
                code=901;
                break;
            case "music":
                code=902;
                break;
            default:
                System.out.println("not valid course");
        }return n1+n2+year+code+counter;
    }
}






