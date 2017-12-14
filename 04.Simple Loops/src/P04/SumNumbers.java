package P04;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=Integer.parseInt(console.nextLine());
        }
        System.out.println(sum);
    }
}
