package P104;

import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int harvest = Integer.parseInt(console.nextLine());
        double oneSquareGrapes = Double.parseDouble(console.nextLine());
        int LittersNeeded =Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        double grapes = harvest*oneSquareGrapes;
        double pros = grapes*40/100;
        double GrapesForWine = pros;
        double wine = GrapesForWine/2.5;
        if (wine<LittersNeeded){
            System.out.printf("It will be a tough winter! More %d liters wine needed.",(int)(LittersNeeded-wine));
        }else{
            System.out.printf("Good harvest this year! Total wine: %d liters.\n",(int)wine);
            System.out.printf("%d liters left -> %d liters per person.",(int)(Math.ceil(wine-LittersNeeded)),(int)(Math.ceil(wine-LittersNeeded))/3);
        }
    }
}
