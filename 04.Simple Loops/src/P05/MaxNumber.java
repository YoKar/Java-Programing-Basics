package P05;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num>maxNum){
                maxNum=num;
            }
        }
        System.out.println(maxNum);
    }
}
