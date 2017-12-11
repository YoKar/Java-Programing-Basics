package P17.Exam;

import java.util.Scanner;

public class MachTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String vipOrNot = console.nextLine().toLowerCase();
        int people = Integer.parseInt(console.nextLine());
        double money = 0;
        double transport = 0.0;
        if (people<=4){
            transport = budget*75/100;
            if(vipOrNot.equals("vip")){
                money = budget-(people*499.99+transport);
            }
            else{
                money = budget-(people*249.99+transport);
            }
        }
        else if(people<=9){
            transport = budget*60/100;
            if(vipOrNot.equals("vip")){
                money = budget-(people*499.99+transport);
            }
            else{
                money = budget-(people*249.99+transport);
            }
        }
        else if (people<=24){
            transport = budget*50/100;
            if(vipOrNot.equals("vip")){
                money = budget-(people*499.99+transport);
            }
            else{
                money = budget-(people*249.99+transport);
            }
        }
        else if (people<=49){
            transport = budget*40/100;
            if(vipOrNot.equals("vip")){
                money = budget-(people*499.99+transport);
            }
            else{
                money = budget-(people*249.99+transport);
            }
        }
        else {
            transport = budget*25/100;
            if(vipOrNot.equals("vip")){
                money = budget-(people*499.99+transport);
            }
            else{
                money = budget-(people*249.99+transport);
            }
        }
        if (money<0){
            System.out.printf("Not enough money! You need %.2f leva.",Math.abs(money));
        }
        else {
            System.out.printf("Yes! You have %.2f leva left.",money);
        }
    }
}
