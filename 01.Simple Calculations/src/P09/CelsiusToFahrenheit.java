package P09;


import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double celsius = Double.parseDouble(console.nextLine());

        double result = celsius*1.8+32;
        System.out.println(result);
    }
}
