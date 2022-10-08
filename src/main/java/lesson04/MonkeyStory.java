package lesson04;

public class MonkeyStory {
    public static void main(String[] args) {
        int numofBananas = 165;
        int surviveDays = 0;
        boolean monkeyAlive = true;

        do{
            System.out.println("Monkey eats 4 bananas every day");
            numofBananas-=4;
            surviveDays++;

            System.out.println("Remaining Bananas "+numofBananas);
            if(numofBananas < 4){
                monkeyAlive = false;
                System.out.println("Today is the day "+(surviveDays+1)+" and there are not enough bananas left");
            }else{
                System.out.println("Today is the day "+surviveDays+" and monkey is alive\n");
            }

        }while (monkeyAlive);
        System.out.println("\nTotal survival days of the mokey are "+(surviveDays));
    }
}
