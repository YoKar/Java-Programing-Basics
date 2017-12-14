package P06;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int MinNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (MinNum>num){
                MinNum=num;
            }
        }
        System.out.println(MinNum);
    }
}
