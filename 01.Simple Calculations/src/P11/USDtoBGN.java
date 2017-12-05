package P11;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double USD = Double.parseDouble(console.nextLine());
        double result = USD*1.79549;
        System.out.printf("%.2f",result);

    }
}
