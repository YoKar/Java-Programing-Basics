package P12;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum1 = 0;
        int sum2 =0;
        int average = 0;
        int maxDiff = 0;


        for (int i = 0; i < n; i++) {
            sum2=sum1;
            int a = Integer.parseInt(console.nextLine());
            int b = Integer.parseInt(console.nextLine());
            sum1=a+b;
            if (i==0){
                continue;
            }
            average = Math.abs(sum1-sum2);
            if (average>maxDiff){
                maxDiff=average;
            }
        }
        if (maxDiff==0){
            System.out.println("Yes, value="+sum1);
        }
        else {
            System.out.println("No, Maxdiff="+maxDiff);
        }

    }
}
