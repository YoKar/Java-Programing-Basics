package P07;



import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());

        double wight = Math.abs(x1-x2);
        double height = Math.abs(y1-y2);

        System.out.println(wight*height);
        System.out.println(2*(wight+height));
    }
}
