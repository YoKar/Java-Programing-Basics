package P12;

import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String leapOrNot = console.nextLine();
        double holidays = Double.parseDouble(console.nextLine());
        double weekendsInHome = Double.parseDouble(console.nextLine());

        double saturdaysInSofia = (48 - weekendsInHome)*(3.0/4.0);
        double gamesSofia = holidays*2.0/3.0;
        double allGames = saturdaysInSofia+gamesSofia+weekendsInHome;
        if(leapOrNot.equals("leap")){
            double bonus = allGames*15.0/100.0;
            System.out.println((int)(Math.floor(allGames+bonus)));
        }
        else {
            System.out.println((int)(Math.floor(allGames)));
        }
    }
}
