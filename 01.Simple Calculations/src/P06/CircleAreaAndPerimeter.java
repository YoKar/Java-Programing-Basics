package P06;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double r = Double.parseDouble(console.nextLine());

        System.out.printf("Area = %f%n",Math.PI*r*r);
        System.out.printf("Perimeter = %f",(Math.PI*2)*r);
    }
}
