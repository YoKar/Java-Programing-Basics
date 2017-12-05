package P14;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());

        if(minutes+15>59){
            hours+=1;
            if(hours>=24){
                hours=0;

            }
            minutes = (minutes + 15) % 60;
            System.out.printf("%d:%02d",hours,minutes);

        }else {
            System.out.printf("%d:%02d",hours,minutes+15);
        }


    }
}
