package P10;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double degrees = Double.parseDouble(console.nextLine());

        double result = ((180/Math.PI)*degrees);
        System.out.printf("%.2f",result);
    }
}
