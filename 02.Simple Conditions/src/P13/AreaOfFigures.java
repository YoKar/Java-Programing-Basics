package P13;

import java.awt.image.DataBufferUShort;
import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String figures = console.nextLine();

        if (figures.equals("square")){
            double num = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",Math.pow(num,2));
        }
        else if (figures.equals("rectangle")){
            double num1 = Double.parseDouble(console.nextLine());
            double num2 = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",num1*num2);
        }
        else if(figures.equals("circle")){
            double num = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",Math.pow(num,2)*Math.PI);
        }
        else if (figures.equals("triangle")){
            double num = Double.parseDouble(console.nextLine());
            double h = Double.parseDouble(console.nextLine());
            System.out.printf("%.3f",(num*h)/2);
        }
    }
}
