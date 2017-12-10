package P08;

import java.util.Scanner;

public class TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String town = console.nextLine().toLowerCase();
        double money = Double.parseDouble(console.nextLine());
        double percent = 0;
        if (town.equals("sofia")){
            if(money>=0&&money<=500){
                percent=5;
            }
            else if(money>500&&money<=1000){
                percent=7;
            }
            else if(money>1000&&money<=10000){
                percent=8;
            }
            else if(money>10000){
                percent=12;
            }
            else{
                System.out.println("error");
            }
        }
        else if (town.equals("varna")){
            if(money>=0&&money<=500){
                percent=4.5;
            }
            else if(money>500&&money<=1000){
                percent=7.5;
            }
            else if(money>1000&&money<=10000){
                percent=10;
            }
            else if(money>10000){
                percent=13;
            }
            else{
                System.out.println("error");
            }
        }
        else if (town.equals("plovdiv")){
            if(money>=0&&money<=500){
                percent=5.5;
            }
            else if(money>500&&money<=1000){
                percent=8;
            }
            else if(money>1000&&money<=10000){
                percent=12;
            }
            else if(money>10000){
                percent=14.5;
            }
            else{
                System.out.println("error");
            }
        }
        else{
            System.out.println("error");
        }
        if(percent>0) {
            double result = money * percent / 100;
            System.out.printf("%.2f", result);
        }
    }
}
