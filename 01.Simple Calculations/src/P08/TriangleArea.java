package P08;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double result = (a*h)/2;
        System.out.printf("Triangle Area = %.2f",result);
    }
}
