package P08;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int oddSum = 0;
        int evenSum =0;
        for (int i = 1; i <=n ; i++) {
            int num = Integer.parseInt(console.nextLine());
            if(i%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
        }
        if (evenSum==oddSum){
            System.out.println("Yes\nSum = "+evenSum);
        }
        else {
            System.out.println("No\nDiff = "+Math.abs(evenSum-oddSum));
        }
    }
}
