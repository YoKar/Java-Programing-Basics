package P04;

import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word= console.nextLine();
       if (word.equals("banana")||word.equals("apple")||word.equals("kiwi")||word.equals("cherry")||word.equals("lemon")||word.equals("grapes")){
           System.out.println("fruit");
       }
       else if (word.equals("tomato")||word.equals("cucumber")||word.equals("pepper")||word.equals("carrot")){
           System.out.println("vegetable");
       }
       else{
           System.out.println("unknown");
       }
    }
}
