package P12;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num = Double.parseDouble(console.nextLine());
        String currency1=console.nextLine();
        String currency2 = console.nextLine();
        double USD = 1.79549;
        double EUR = 1.95583;
        double GBR = 2.53405;
        double BGN = 1;
        double result =0;
        switch (currency1){
            case "USD":
                result=num*USD;
                if (currency2.equals("USD")) {
                    System.out.printf("%.2f USD",(result/USD));
                }
                else if (currency2.equals("EUR")){
                    System.out.printf("%.2f EUR",(result/EUR));
                }
                else if (currency2.equals("GBR")){
                    System.out.printf("%.2f GBR",(result/GBR));
                }
                else if (currency2.equals("BGN")){
                    System.out.printf("%.2f BGN",(result/BGN));
                }
                break;
            case "EUR":
                result=num*EUR;
               if(currency2.equals("USD")) {
                    System.out.printf("%.2f USD",(result/USD));
                }
                else if (currency2.equals("EUR")){
                    System.out.printf("%.2f EUR",(result/EUR));
                }
                else if (currency2.equals("GBR")){
                    System.out.printf("%.2f GBR",(result/GBR));
                }
                else if (currency2.equals("BGN")){
                    System.out.printf("%.2f BGN",(result/BGN));
                }
                break;

            case "GBR":
                result=num*GBR;
                if(currency2.equals("USD")) {
                    System.out.printf("%.2f USD",(result/USD));
                }
                else if (currency2.equals("EUR")){
                    System.out.printf("%.2f EUR",(result/EUR));
                }
                else if (currency2.equals("GBR")){
                    System.out.printf("%.2f GBR",(result/GBR));
                }
                else if (currency2.equals("BGN")){
                    System.out.printf("%.2f BGN",(result/BGN));
                }
                break;

            case "BGN":
                result=num*BGN;
                if(currency2.equals("USD")) {
                    System.out.printf("%.2f USD",(result/USD));
                }
                else if (currency2.equals("EUR")){
                    System.out.printf("%.2f EUR",(result/EUR));
                }
                else if (currency2.equals("GBR")){
                    System.out.printf("%.2f GBR",(result/GBR));
                }
                else if (currency2.equals("BGN")){
                    System.out.printf("%.2f BGN",(result/BGN));
                }
                break;
        }
    }
}
