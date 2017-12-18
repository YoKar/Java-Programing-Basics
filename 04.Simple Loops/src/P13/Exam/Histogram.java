package P13.Exam;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        double under200 =0;
        double under399 =0;
        double under599 =0;
        double under799 =0;
        double over800 =0;
        for (int i = 0; i < n; i++) {
            double num = Double.parseDouble(console.nextLine());
            if (num<200){
                under200++;
            }
            else if (num<=399){
                under399++;
            }else if (num<=599){
                under599++;
            }
            else if (num<=799){
                under799++;
            }
            else{
                over800++;
            }
        }
        System.out.printf("%.2f%%\n",(under200/n)*100);
        System.out.printf("%.2f%%\n",(under399/n)*100);
        System.out.printf("%.2f%%\n",(under599/n)*100);
        System.out.printf("%.2f%%\n",(under799/n)*100);
        System.out.printf("%.2f%%",(over800/n)*100);
    }
}
