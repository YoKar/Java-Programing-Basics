package P16.Exam;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num1,num2,sum,multiple,division,minus;
        num1=Double.parseDouble(console.nextLine());
        num2=Double.parseDouble(console.nextLine());
        sum = (int)(num1+num2);
        multiple=(int)(num1*num2);
        division=num1/num2;
        minus=(int)(num1-num2);
        char symbol = console.nextLine().charAt(0);

        if (symbol=='+'){
            if (sum%2==0){
                System.out.printf("%d + %d = %d - even",(int)num1,(int)num2,(int)sum);
            }
            else{
                System.out.printf("%d + %d = %d - odd",(int)num1,(int)num2,sum);
            }
        }
        else if(symbol=='-'){
            if (minus%2==0){
                System.out.printf("%d - %d = %d - even",(int)num1,(int)num2,(int)minus);
            }
            else{
                System.out.printf("%d - %d = %d - odd",(int)num1,(int)num2,(int)minus);
            }
        }
        else if (symbol=='*'){
            if (multiple%2==0){
                System.out.printf("%d * %d = %d - even",(int)num1,(int)num2,(int)multiple);
            }
            else{
                System.out.printf("%d * %d = %d - odd",(int)num1,(int)num2,(int)multiple);
            }
        }
        else if (symbol=='/'){
            if (num1==0||num2==0){
                double bigNum = Math.max(num1,num2);
                System.out.printf("Cannot divide %.0f by zero",bigNum);
            }
            else{
                System.out.printf("%.0f / %.0f = %.2f",num1,num2,division);
            }
        }
        else{
            if(num1==0||num2==0){
                double bigNum = Math.max(num1,num2);
                System.out.printf("Cannot divide %.0f by zero",bigNum);
            }
            else{
                System.out.printf("%d %% %d = %d",(int)num1,(int)num2,(int)(num1%num2));
            }

        }

    }
}
