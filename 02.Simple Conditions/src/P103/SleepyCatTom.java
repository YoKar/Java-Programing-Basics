package P103;

import java.util.Scanner;

public class SleepyCatTom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int daysOff = Integer.parseInt(console.nextLine());
        int workDays = 365-daysOff;
        int minutesForPlay = workDays*63+daysOff*127;
        int hours = 0;
        int minutes =0;
        if(minutesForPlay>30000){
            int moreForPlay = minutesForPlay-30000;
            hours =moreForPlay/60;
            minutes=moreForPlay%60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play",hours,minutes);
        }
        else {
            int minutesLess = 30000-minutesForPlay;
            hours=minutesLess/60;
            minutes=minutesLess%60;

            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play",hours,minutes);
        }
    }
}
