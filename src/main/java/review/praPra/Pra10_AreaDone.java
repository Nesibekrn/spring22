package review.praPra;

abstract public class Pra10_AreaDone {
   /*
      A list has elements “M”, “K” and “P”
      Ask user to enter a letter
      If the letter exists in list convert it to "Got it"
      otherwise add it to the list.
      */
//   public static void main(String[] args) {
//       List<String> letters=new ArrayList<>();
//       letters.add("M");
//       letters.add("K");
//       letters.add("P");
//       System.out.println(letters);
//       Scanner input=new Scanner(System.in);
//       System.out.println("enter a letter");
//       String a= input.next();
//       if (letters.contains(a)){
//          letters.set(letters.indexOf(a),"got it" );
//           System.out.println(letters);
//       }else{
//           letters.add(a);
//           System.out.println(letters);
//       }
//   }
    /*
    Ask user to enter a number and print on console number by number matrix.
    Example:
    Input: 10
    Output:
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    0 0 1 0 0 0 0 1 1 0
    1 1 1 0 0 1 1 1 1 0
*/
//   public static void main(String[] args) {
//       Scanner input=new Scanner(System.in);
//       System.out.println("enter a number");
//      int a= input.nextInt();
//       for (int i = 0; i <a ; i++) {
//           for (int j = 0; j <a ; j++) {
//               System.out.print((int)(Math.random()*2)+" ");
//           }
//           System.out.println();
//       }
//   }

    /*
    Type code to calculate BMI (Do NOT ignore security).With getter and setter and also runner:)
    The BMI is defined as the body mass divided by the square of the body height.
    Major adult BMI classifications are underweight (under 18.5 kg/m2), normal weight (18.5 to 24.9), overweight (25 to 29.9), and obese (30 or more).
    */
//    private double weight;
//    private double height;
//    public Pra10(double weight, double height) {
//        this.weight = weight;
//        this.height = height;
//    }
//    public double getWeight() {
//        return weight;
//    }
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//    public double getHeight() {
//        return height;
//    }
//    public void setHeight(double height) {
//        this.height = height;
//    }
//    public void bMI(){
//        double bMI=weight/(height*height);
//        String result= bMI<18.5 ? "underweight":(bMI<24.9&&bMI>18.5 ? "normal weight": (bMI<29.9&&bMI>25 ? "overweight": "obese"));
//        System.out.println(result);
//    }

    /*
   Count the frequency of the letters in a given String as the format below:
   Input: String str = "Java is so Good";
   Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
    */
//    public static void main(String[] args) {
//        String str="Java is so Good";
//        String nStr=str.replaceAll("[^a-zA-Z]","");
//        String ns="";
//
//        for (int i = 0; i <nStr.length() ; i++) {
//            int frequency=0;
//            for (int j = 0; j <nStr.length() ; j++) {
//                if(nStr.charAt(i)==nStr.charAt(j)){
//                    frequency++;
//                }
//            }
//            if (!(ns.contains(String.valueOf(nStr.charAt(i))))){
//                ns=ns+nStr.charAt(i)+frequency+" ";
//            }
//        }
//        System.out.println(ns);
//    }

    /*
    Create a method that accepts a String as parameter and finds the sum of digits in that String.
    Example:
    input : J4\/4 1$ 34$¥
    output : 16
    Hint:
    Character.isDigit()
    Integer.valueOf()
   */
//    public static void sum(String a){
//        int sum=0;
//        for (int i = 0; i <a.length() ; i++) {
//            if (Character.isDigit(a.charAt(i))){
//                sum+=Integer.valueOf(""+a.charAt(i));
//            }
//        }
//        System.out.println(sum);
//    }
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        String a= input.nextLine();
//        sum(a);
//    }

    // Type code to calculate area of rectangle and triangle.(Use abstraction)
    public abstract void recta(int height, int widht);
    public abstract void tri(int heigt, double base);
}
