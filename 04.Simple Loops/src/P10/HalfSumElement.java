package P10;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num>maxNum){
                maxNum=num;
            }
            sum+=num;
        }
        if ((sum-maxNum)==maxNum){
            System.out.println("Yes\nSum = "+maxNum);
        }
        else{
            System.out.println("No\nDiff = "+Math.abs((sum-maxNum)-maxNum));
        }
    }
}
