package P11;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String projection = console.nextLine();
        double rows = Double.parseDouble(console.nextLine());
        double cols = Double.parseDouble(console.nextLine());

        double allPlaces = rows*cols;

        switch (projection){
            case "Premiere":
                System.out.printf("%.2f \nleva",allPlaces*12);
                break;
            case "Normal":
                System.out.printf("%.2f \nleva",allPlaces*7.50);
                break;
            case "Discount":
                System.out.printf("%.2f \nleva",allPlaces*5);
                break;
        }
    }
}
