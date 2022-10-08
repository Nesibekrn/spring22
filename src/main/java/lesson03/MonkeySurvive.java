package lesson03;

public class MonkeySurvive {
    public static void main(String[] args) {
        int numberofBananas = 165;
        int survivalDays = 0;
        boolean monkeyAlive = true;

        do{
            System.out.println("Monkey can eat 4 bananas each day: ");
            numberofBananas -= 4;  //numberofBananas = numberofBananas - 4;
            survivalDays++;
            System.out.println("Remaining Bananas: "+numberofBananas);
            if(numberofBananas < 4){
                monkeyAlive = false;
                System.out.println("Today is the day "+(survivalDays+1)+" and there are not enough bananas");
            }else{
                System.out.println("Today is the day "+survivalDays+ " and monkey is still alive.\n");
            }
        }while (monkeyAlive);
        System.out.println("\nTotal number of days the monkey will survive "+(survivalDays));
    }
}
