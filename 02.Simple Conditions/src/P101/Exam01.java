package P101;

import java.util.Scanner;

public class Exam01 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int kilometers = Integer.parseInt(console.nextLine());
        String dayOrNight = console.nextLine();

        if(kilometers<20){
            if (dayOrNight.equals("night")){
                System.out.printf(("%.2f"),kilometers*0.90+0.70);
            }
            else{
                System.out.printf(("%.2f"),kilometers*0.79+0.70);
            }
        }
        else if (kilometers>=20&&kilometers<100){

                System.out.printf(("%.2f"),kilometers*0.09);


        }
        else {
            System.out.printf(("%.2f"),kilometers*0.06);
        }
    }
}
