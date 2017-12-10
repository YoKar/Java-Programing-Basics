package P13;

import java.util.Scanner;

public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());
        int x1 = 0;
        int y1=0;
        int x2 =h*3;
        int y2 =h*1;
        int x3=h*1;
        int y3=h;
        int x4 =h*2;
        int y4 = h*4;

        if (((x>x1&&x<x2)&&(y>y1&&y<y2)||(x>x3&&x<x4)&&(y>y3&&y<y4))){
            System.out.println("inside");
        }
        else if (((x==x1||x==x2)&&(y>y1&&y<y2))||((x>x1&&x<x2)&&(y==y1)||(y==y2))){
            System.out.println("border");
        }
        else if (((x==x3||x==x4)&&(y>y3&&y<y4))||((x>x3&&x<x4)&&(y==y3)||(y==y4))){
            System.out.println("border");
        }
        else {
            System.out.println("outside");
        }
    }
}
