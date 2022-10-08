package review.praPra;

public class Pra07Done {

        /*

    Type a simple 5-item grocery shopping program.

    1st Step: Select a product from the product list and ask how much it weighs.

    2nd Step: Ask if he/she wants to buy another item.
               If she/he does not want it, show the total amount, if she/he does, select the product again.

   3rd Step: Each time the customer selects an item, add the price of the item they bought to the total price.

   4th Step: Show the total amount to be paid when the shopping is over.*/

       /*static List<String> groccery=new ArrayList<>();
    static List<Double> price=new ArrayList<>();
    static double totalprice;

    public static void main(String[] args) {
        groccery.add("Apple");
        groccery.add("Orange");
        groccery.add("Lemon");
        groccery.add("Spanish");
        groccery.add("Carrot");

        price.add(1.2);
        price.add(3.0);
        price.add(1.5);
        price.add(5.0);
        price.add(4.0);

        shopping();
    }
public static void shopping(){
    Scanner input =new Scanner(System.in);
    System.out.println("Enter the number what you want to buy" +"\n"+"1-Apple" +"\n"+"2-Orange" +"\n"+"3-Lemon"+
            "\n"+ "4-Spanish" +"\n"+"5-Carrot" +"\n"+"0-finish the shopping");
    int item=input.nextInt();
    if(!(item>-1&&item<6)){
        System.out.println("Enter a valid number");
        shopping();
    }
    System.out.println("Enter weight what you want to buy");
    double weight=input.nextDouble();
        totalprice+=price.get(item-1)*weight;

    System.out.println("enter 1 to continue shopping"+"\n"+"Enter 2 to end shopping");
    int option=input.nextInt();
    if (option==1){
        shopping();
    }else if (option==2){
        System.out.println("Total amount is "+totalprice);
    }

        }*/


    //Check if a String is palindrome or not.==>12321 StringBuilder kullan
//StringBuilder a=new StringBuilder("12332");
//String b=a.toString();
//String c=a.reverse().toString();
//        System.out.println("Is the number palindrome ? "+b.equals(c));

    //Write a Java method to find the smallest number among three numbers given by user.
//       Scanner input=new Scanner(System.in);
//       int a=input.nextInt();
//       int b= input.nextInt();
//       int c=input.nextInt();
//        System.out.println(minimum(a,b,c));

//    public static int minimum(int a, int b, int c){
//        int min= Math.min(a,Math.min(b,c));
//        return min;
//    }

// Convert the "Congratulations" word to "sn**t*l*t*rgn*C" by using Array methods.
//public static void main(String[] args) {
//    String s="Congratulations";
//    String arr[]= new String[s.length()];
//    String n="";
//           for (int i = 0; i <s.length() ; i++) {
//        String o=s.substring((s.length()-1-i),(s.length()-i));
//        if(o.equals("a")||o.equals("e")||o.equals("i")||o.equals("o")||o.equals("u")){
//            o="*";
//        }
//      arr[i]=o;
//        n+=arr[i];
//    }
//
//    System.out.println(n);
//}}

    /*
       Take the exam point from user and print the grade on console by using switch statement according to the rules below:

         F--> (0.00 - 1.00)
         D--> (1.00 - 2.00)
         C--> (2.00 - 2.50)
         B--> (2.50 - 3.50)
         A--> (3.50 - 4.00)
         (Firsts inclusive - Seconds exclusive)
        */
//public static void main(String[] args) {
//    Scanner input=new Scanner(System.in);
//    System.out.println("Enter your exam point");
//    double examPoint= input.nextDouble();
//    String grade="";
//    if (examPoint<1.00&&examPoint>=0.00){
//        grade="Fail";
//    }else if (examPoint<2.00&&examPoint>=1.00){
//        grade="Good";
//    }if (examPoint<2.50&&examPoint>=2.00){
//        grade="Better";
//    }if (examPoint<3.50&&examPoint>=2.50){
//        grade="Superior";
//    }if (examPoint<=4.00&&examPoint>=3.50){
//        grade="Excellent";
//    }
//    switch(grade){
//        case "Fail": System.out.println("F");
//        break;
//        case "Good":
//            System.out.println("D");
//            break;
//        case "Better":
//            System.out.println("C");
//            break;
//        case "Superior":
//            System.out.println("B");
//            break;
//        case "Excellent":
//            System.out.println("A");
//            break;
//        default:
//            System.out.println("Exam point is invalid");
//            break;
//    }
    //Type a method to check if an int Array is symmetrical or not.
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 1};
        System.out.println("Is Array symetrical? "+symetrical(arr));
    }
    public static boolean symetrical(int arr[]){
        boolean isSymetrical=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[arr.length - 1 - i]){
                isSymetrical=true;
            } else{
                isSymetrical=false;
                break;
            }
        }
        return isSymetrical;
    }

}
















