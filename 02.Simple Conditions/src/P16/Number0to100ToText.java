package P16;

import java.util.Scanner;

public class Number0to100ToText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        if(num<0||num>100){
            System.out.println("invalid number");
        }
        else if (num==0){
            System.out.println("zero");
        }
        else if (num==10){
            System.out.println("ten");
        }
        else if (num==11){
            System.out.println("eleven");
        }else if (num==12){
            System.out.println("twelve");
        }else if (num==20){
            System.out.println("twenty");
        }else if (num==30){
            System.out.println("thirty");
        }else if (num==40){
            System.out.println("forty");
        }else if (num==50){
            System.out.println("fifty");
        }else if (num==60){
            System.out.println("sixty");
        }else if (num==70){
            System.out.println("seventy");
        }else if (num==80){
            System.out.println("eighty");
        }else if (num==90){
            System.out.println("ninety");
        }else if (num==100){
            System.out.println("one hundred");
        }
        else if (num<10){
            if (num==1){
                System.out.println("one");
            }
            else if(num==2){
                System.out.println("two");
            }else if(num==3){
                System.out.println("three");
            }else if(num==4){
                System.out.println("four");
            }else if(num==5){
                System.out.println("five");
            }else if(num==6){
                System.out.println("six");
            }else if(num==7){
                System.out.println("seven");
            }else if(num==8){
                System.out.println("eight");
            }else {
                System.out.println("nine");
            }
        }
       else {

            if (num/10==1){
                if(num%10==3){
                    System.out.println("thirteen");
                }else if(num%10==4){
                    System.out.println("fourteen");
                }else if(num%10==5){
                    System.out.println("fifteen");
                }else if(num%10==6){
                    System.out.println("sixteen");
                }else if(num%10==7){
                    System.out.println("seventeen");
                }else if(num%10==8){
                    System.out.println("eighteen");
                }else if(num%10==9){
                    System.out.println("nineteen");
                }
            }
            else if(num/10==2){
                if (num%10==1){
                    System.out.println("twenty one");
                }
                else if(num%10==2){
                    System.out.println("twenty two");
                }else if(num%10==3){
                    System.out.println("twenty three");
                }else if(num%10==4){
                    System.out.println("twenty four");
                }else if(num%10==5){
                    System.out.println("twenty five");
                }else if(num%10==6){
                    System.out.println("twenty six");
                }else if(num%10==7){
                    System.out.println("twenty seven");
                }else if(num%10==8){
                    System.out.println("twenty eight");
                }else {
                    System.out.println("twenty nine");
                }
            }
            else if(num/10==3){
                if (num%10==1){
                    System.out.println("thirty one");
                }
                else if(num%10==2){
                    System.out.println("thirty two");
                }else if(num%10==3){
                    System.out.println("thirty three");
                }else if(num%10==4){
                    System.out.println("thirty four");
                }else if(num%10==5){
                    System.out.println("thirty five");
                }else if(num%10==6){
                    System.out.println("thirty six");
                }else if(num%10==7){
                    System.out.println("thirty seven");
                }else if(num%10==8){
                    System.out.println("thirty eight");
                }else {
                    System.out.println("thirty nine");
                }
            }
            else if(num/10==4){
                if (num%10==1){
                    System.out.println("forty one");
                }
                else if(num%10==2){
                    System.out.println("forty two");
                }else if(num%10==3){
                    System.out.println("forty three");
                }else if(num%10==4){
                    System.out.println("forty four");
                }else if(num%10==5){
                    System.out.println("forty five");
                }else if(num%10==6){
                    System.out.println("forty six");
                }else if(num%10==7){
                    System.out.println("forty seven");
                }else if(num%10==8){
                    System.out.println("forty eight");
                }else {
                    System.out.println("forty nine");
                }
            }else if(num/10==5){
                if (num%10==1){
                    System.out.println("fifty one");
                }
                else if(num%10==2){
                    System.out.println("fifty two");
                }else if(num%10==3){
                    System.out.println("fifty three");
                }else if(num%10==4){
                    System.out.println("fifty four");
                }else if(num%10==5){
                    System.out.println("fifty five");
                }else if(num%10==6){
                    System.out.println("fifty six");
                }else if(num%10==7){
                    System.out.println("fifty seven");
                }else if(num%10==8){
                    System.out.println("fifty eight");
                }else {
                    System.out.println("fifty nine");
                }
            }else if (num/10==6){
                if (num%10==1){
                    System.out.println("sixty one");
                }
                else if(num%10==2){
                    System.out.println("sixty two");
                }else if(num%10==3){
                    System.out.println("sixty three");
                }else if(num%10==4){
                    System.out.println("sixty four");
                }else if(num%10==5){
                    System.out.println("sixty five");
                }else if(num%10==6){
                    System.out.println("sixty six");
                }else if(num%10==7){
                    System.out.println("sixty seven");
                }else if(num%10==8){
                    System.out.println("sixty eight");
                }else {
                    System.out.println("sixty nine");
                }
            }else if(num/10==7){
                if (num%10==1){
                    System.out.println("seventy one");
                }
                else if(num%10==2){
                    System.out.println("seventy two");
                }else if(num%10==3){
                    System.out.println("seventy three");
                }else if(num%10==4){
                    System.out.println("seventy four");
                }else if(num%10==5){
                    System.out.println("seventy five");
                }else if(num%10==6){
                    System.out.println("seventy six");
                }else if(num%10==7){
                    System.out.println("seventy seven");
                }else if(num%10==8){
                    System.out.println("seventy eight");
                }else {
                    System.out.println("seventy nine");
                }
            }else if(num/10==8){
                if (num%10==1){
                    System.out.println("eighty one");
                }
                else if(num%10==2){
                    System.out.println("eighty two");
                }else if(num%10==3){
                    System.out.println("eighty three");
                }else if(num%10==4){
                    System.out.println("eighty four");
                }else if(num%10==5){
                    System.out.println("eighty five");
                }else if(num%10==6){
                    System.out.println("eighty six");
                }else if(num%10==7){
                    System.out.println("eighty seven");
                }else if(num%10==8){
                    System.out.println("eighty eight");
                }else {
                    System.out.println("eighty nine");
                }
            }else if (num/10==9){
                if (num%10==1){
                    System.out.println("ninety one");
                }
                else if(num%10==2){
                    System.out.println("ninety two");
                }else if(num%10==3){
                    System.out.println("ninety three");
                }else if(num%10==4){
                    System.out.println("ninety four");
                }else if(num%10==5){
                    System.out.println("ninety five");
                }else if(num%10==6){
                    System.out.println("ninety six");
                }else if(num%10==7){
                    System.out.println("ninety seven");
                }else if(num%10==8){
                    System.out.println("ninety eight");
                }else {
                    System.out.println("ninety nine");
                }
            }
        }
    }
}
