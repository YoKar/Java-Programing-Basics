package P14.Exam;

import java.util.Scanner;

public class ModuleDivision {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        double module2=0;
        double module3=0;
        double module4=0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());

            if (num%2==0){
                module2++;
            }
            if(num%3==0){
                module3++;
            }
            if (num%4==0){
                module4++;
            }
        }
        System.out.printf("%.2f%%\n",(module2/n)*100);
        System.out.printf("%.2f%%\n",(module3/n)*100);
        System.out.printf("%.2f%%",(module4/n)*100);
    }
}
