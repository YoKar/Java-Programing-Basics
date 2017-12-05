package P07;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());
        int num3 = Integer.parseInt(console.nextLine());

        int allSeconds = num1+num2+num3;
        int minutes = allSeconds/60;
        int seconds = allSeconds%60;

        System.out.printf("%d:%02d",minutes ,seconds);
    }
}
