package review.praPra;

public class Pra09Done {
    //Ask user to enter 2 chars and print on console the chars between them.
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.println("enter two char");
//        String ch1=input.next();
//        String ch2=input.next();
//
//        char c1=ch1.charAt(0);
//        char c2=ch2.charAt(0);
//        for (char i = c1 ; i <=c2 ; i++) {
//            System.out.print(i+" ");
//        }
//    }
    /*
  Take the number of rows from user and print on console the shape based on rows.

                 *
                * *
               * * *
              * * * *
             * * * * *
   */
//    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//       System.out.println("enter number of row");
//        int row =input.nextInt();
//        for (int i = 0; i <row ; i++) {
//            for (int k = row-i ; k >0 ; k--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <i+1 ; j++) {
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//    }
    //Create a Java programme to calculate the volume of cylinder and rectangular prism. (Use inheritance)with runner
    public double volumeRect(double a, double b, double height){
        return a*b*height;
    }
    public double volumeClynder(double radious, double height){
        return 3.14*radious*radious*height;
    }

    //Type code to add books to library with its information, then create a method to show information of book.
//    String bookName;
//    String autorName;
//    int numOfPage;
//    static int numOfBook;
//    String bookID;
//    Pra09(String bookName,String autorName,int numOfPage){
//        this.bookName=bookName;
//        this.autorName=autorName;
//        this.numOfPage=numOfPage;
//        numOfBook++;
//        this.bookID=bookName.substring(0,2)+numOfBook;
//    }
//    public void displayBooks(){
//        System.out.println("Book Name: "+bookName+" Autor Name: "+autorName+" Number Of Page: "+numOfPage+" Book ID: "+bookID);
//    }
//    public static void main(String[] args) {
//       Pra09 book1=new Pra09("karacaoğlan","kara",275);
//       Pra09 book2=new Pra09("zalım","insan",900);
//       Pra09 book3=new Pra09("guzel","hayat",58420);
//       book3.displayBooks();
//       book2.displayBooks();
//       book1.displayBooks();
//    }

    // Create a method to calculate 4 students' 6, 4, 3 and 5 exams' average respectively.
//       public static void average(String stdnName,double... exPoints){
//        double sum=0;
//        for(double s:exPoints){
//            sum+=s;
//        }
//           System.out.println("Average of "+stdnName+" is: "+String.format("%.2f",sum/ exPoints.length));
//    }
//    public static void main(String[] args) {
//       average("kamil",56,75,85);
//        average("sezgin",75,85,65,45);
//        average("kenan",80,50,70,30,80);
//        average("yasemin",100,50,70,60,40,30);
//    }

      /* Create a method to add 10 random integers from 0 to 20 into a List. Convert even numbers to 111.
       If there is no even number print on console "There is no even number".*/
//    public static void convertion(){
//    List<Integer>random=new ArrayList<>();
//        for (int i = 1; i <11 ; i++) {
//            random.add((int)(Math.random()*20));
//        }
//        System.out.println("the list is "+random);
//        int counter=0;
//        for (int i = 0; i < random.size() ; i++) {
//            if(random.get(i)%2==0){
//                random.set(i,111);
//            }counter++;
//    }if (counter==0){
//            System.out.println("There is no even number");
//        }else System.out.println(random);
//}
//    public static void main(String[] args) {
//        convertion();
//    }
}
