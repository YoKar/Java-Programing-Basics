package P01;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double age = Double.parseDouble(console.nextLine());
        String title = console.nextLine();

        if (title.equals("m")){
            if (age<16){
                System.out.println("Master");
            }
            else if (age>=16){
                System.out.println("Mr.");
            }
        }
        else {
            if (age<16){
                System.out.println("Miss");
            }
            else if(age>=16){

                System.out.println("Ms.");
            }
        }
    }
}
