package P06;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Integer.parseInt(console.nextLine());
        double bonus = 0;
         if (num <=100){
             bonus+=5;
         }
         else if (num >1000){
             bonus+=num*0.1;
         }
         else if (num>100){
             bonus+=num*0.2;
         }
         if (num%2==0){
             bonus+=1;
         }
         if(num%10==5){
             bonus+=2;
         }
        System.out.println(bonus);
        System.out.println(bonus+num);
    }
}
