package P15.Exam;

import java.util.Scanner;

public class TheSmartLili {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double wondering = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());
        int money=0;
        int toys=0;
        int sum=10;
        int counter=0;
        for (int i = 1; i <= age; i++) {
            if (i%2==0){
                money+=sum;
                sum+=10;
                counter++;
            }
            else{
                toys++;
            }
        }
        money+=(toys*toyPrice)-counter;
        if (money>=wondering){
            System.out.printf("Yes! %.2f",(money-wondering)*1.00);
        }
        else{
            System.out.printf("No! %.2f",(wondering-money)*1.00);
        }
    }
}
