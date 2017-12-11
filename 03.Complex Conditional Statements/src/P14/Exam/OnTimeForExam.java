package P14.Exam;

import java.util.Scanner;

public class OnTimeForExam {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int examHours , examMinutes , hoursIncome , minutesIncome;
        examHours=Integer.parseInt(console.nextLine());
        examMinutes=Integer.parseInt(console.nextLine());
        hoursIncome=Integer.parseInt(console.nextLine());
        minutesIncome=Integer.parseInt(console.nextLine());

        examMinutes+=examHours*60;
        minutesIncome+=hoursIncome*60;

        if(examMinutes<minutesIncome){
            System.out.println("late");
            if ((minutesIncome-examMinutes)<60){
                System.out.printf("%d minutes after the start",minutesIncome-examMinutes);
            }
            else {
                System.out.printf("%d:%02d hours after the start",(minutesIncome-examMinutes)/60,(minutesIncome-examMinutes)%60);
            }
        }
        else if (examMinutes>minutesIncome&&(examMinutes-minutesIncome)>30){
            if (examMinutes-minutesIncome>59){
                System.out.println("Early");
                System.out.printf("%d:%02d hours before the start",(examMinutes-minutesIncome)/60,(examMinutes-minutesIncome)%60);
            }
            else {
                System.out.println("Early");
                System.out.printf("%d minutes before the start",examMinutes-minutesIncome);
            }
        }
        else{
            if(examMinutes-minutesIncome==0){
                System.out.println("On time");
            }
            else{
                System.out.println("On time");
                System.out.printf("%d minutes before the start",examMinutes-minutesIncome);
            }

        }
    }
}
