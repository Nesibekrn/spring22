package practice08;
public class Q04 {
    //Create a method that joins the given Strings
    //input => "Please", "join", "the", "given", "words"
    //output => "Please join the given words"
    public static void main(String[] args) {

        join("Please", "join", "the", "given", "words", "...");

    }

    public static void join(String... str){
        String strNew="";
        for(String w:str){
            strNew+=w+" ";
        }
        System.out.println(strNew);
    }
}