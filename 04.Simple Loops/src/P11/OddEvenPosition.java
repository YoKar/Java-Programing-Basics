package P11;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        double oddSum =0;
        double oddMin = Integer.MAX_VALUE;
        double oddMax = Integer.MIN_VALUE;
        double EvenSum = 0;
        double EvenMin = Integer.MAX_VALUE;
        double EvenMax = Integer.MIN_VALUE;
        DecimalFormat df = new DecimalFormat("#.#########");
        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(console.nextLine());
            if (i%2==0){
                EvenSum+=num;
                if (num>EvenMax){
                    EvenMax=num;
                }
                if (num<EvenMin){
                    EvenMin=num;
                }
            }
            else {
                oddSum+=num;
                if (num>oddMax){
                    oddMax=num;
                }
                if (num<oddMin){
                    oddMin=num;
                }
            }
        }




        System.out.println("OddSum="+df.format(oddSum));
        if (oddMin==Integer.MAX_VALUE){
            System.out.println("OddMin=No");
        }
        else{
            System.out.println("OddMin="+df.format(oddMin));
        }
        if (oddMax==Integer.MIN_VALUE){
            System.out.println("OddMax=No");
        }
        else{
            System.out.println("OddMax="+df.format(oddMax));
        }
        System.out.println("EvenSum="+df.format(EvenSum));
        if (EvenMin==Integer.MAX_VALUE){
            System.out.println("EvenMin=No");
        }
        else {
            System.out.println("EvenMin="+df.format(EvenMin));
        }
        if (EvenMax==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }
        else {
            System.out.println("EvenMax="+df.format(EvenMax));
        }

    }
}
