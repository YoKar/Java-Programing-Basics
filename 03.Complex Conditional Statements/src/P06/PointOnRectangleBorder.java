package P06;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1=Double.parseDouble(console.nextLine());
        double y1=Double.parseDouble(console.nextLine());
        double x2=Double.parseDouble(console.nextLine());
        double y2=Double.parseDouble(console.nextLine());
        double x=Double.parseDouble(console.nextLine());
        double y=Double.parseDouble(console.nextLine());

        boolean border = ((x==x1||x==x2)||(y==y1||y==y2))&&((x>=x1&&x<=x2)&&(y>=y1&&y<=y2));
        if (border){
            System.out.println("Border");
        }
        else{
            System.out.println("Inside / Outside");
        }
    }
}
