package P08;

import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        String first = console.nextLine();
        String second = console.nextLine();
        double result = 0;
        double meter = 1;
        double millimeters = 1000;
        double centimeters = 100;
        double miles = 0.000621371192;
        double inches = 39.3700787;
        double kilometers = 0.001;
        double feet = 3.2808399;
        double yards = 1.0936133;

        if (first.equals("m")){
            result = num/meter;
        }else if (first.equals("mm")){
            result = num/millimeters;
        }else if (first.equals("cm")){
            result = num/centimeters;
        }else if (first.equals("mi")){
            result = num/miles;
        }else if (first.equals("in")){
            result = num/inches;
        }else if (first.equals("km")){
            result = num/kilometers;
        }else if (first.equals("ft")){
            result = num/feet;
        }else if (first.equals("yd")){
            result = num/yards;
        }

        if(second.equals("m")){
            result*=meter;
        }else if (second.equals("mm")){
            result*=millimeters;
        }else if (second.equals("cm")){
            result*=centimeters;
        }
        else if (second.equals("mi")){
            result*=miles;
        }else if (second.equals("in")){
            result*=inches;
        }else if (second.equals("km")){
            result*=kilometers;
        }else if (second.equals("ft")){
            result*=feet;
        }else if (second.equals("yd")){
            result*=yards;
        }

        System.out.printf("%f %s",result,second);

    }
}
