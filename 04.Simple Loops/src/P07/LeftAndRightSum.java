package P07;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int rightSum = 0;
        int leftSum  =0;
        for (int i = 1; i <= n * 2; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (i<=n){
                leftSum+=num;
            }
            else {
                rightSum+=num;
            }
        }
        if (leftSum==rightSum){
            System.out.println("Yes, sum = "+leftSum);
        }
        else {
            System.out.println("No, diff = "+Math.abs(leftSum-rightSum));
        }
    }
}
