package P07;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine().toLowerCase();
        String dayOfWeek = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        double price =0;
        if (dayOfWeek.equals("sunday")||dayOfWeek.equals(("saturday"))){
            if(fruit.equals("banana")){
                price=2.70;
            }
            else if(fruit.equals("apple")){
                price=1.25;
            }
            else if(fruit.equals("orange")){
                price=0.90;
            }
            else if(fruit.equals("grapefruit")){
                price=1.60;
            }
            else if(fruit.equals("kiwi")){
                price=3.00;
            }
            else if(fruit.equals("pineapple")){
                price=5.60;
            }
            else if (fruit.equals("grapes")){
                price=4.20;
            }
            else {
                System.out.println("error");
            }
        }
        else if(dayOfWeek.equals("monday")||dayOfWeek.equals("tuesday")||dayOfWeek.equals("wednesday")||dayOfWeek.equals("thursday")||dayOfWeek.equals("friday")){
            if(fruit.equals("banana")){
                price=2.50;
            }
            else if(fruit.equals("apple")){
                price=1.20;
            }
            else if(fruit.equals("orange")){
                price=0.85;
            }
            else if(fruit.equals("grapefruit")){
                price=1.45;
            }
            else if(fruit.equals("kiwi")){
                price=2.70;
            }
            else if(fruit.equals("pineapple")){
                price=5.50;
            }
            else if (fruit.equals("grapes")){
                price=3.85;
            }
            else {
                System.out.println("error");
            }
        }
        else {
            System.out.println("error");
        }
        if (price>0){
            System.out.println(price*quantity);
        }
    }
}
