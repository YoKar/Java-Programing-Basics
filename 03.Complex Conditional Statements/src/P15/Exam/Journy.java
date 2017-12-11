package P15.Exam;

import java.util.Scanner;

public class Journy {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine();

        if (budget<=100){
            if (season.equals("summer")){
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Camp - %.2f",budget*30/100);
            }
            else{
                System.out.println("Somewhere in Bulgaria");
                System.out.printf("Hotel - %.2f",budget*70/100);
            }
        }
        else if (budget>100&&budget<=1000){
            if (season.equals("summer")){
                System.out.println("Somewhere in Balkans");
                System.out.printf("Camp - %.2f",budget*40/100);
            }
            else{
                System.out.println("Somewhere in Balkans");
                System.out.printf("Hotel - %.2f",budget*80/100);
            }
        }
        else{
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f",budget*90/100);
        }
    }
}
