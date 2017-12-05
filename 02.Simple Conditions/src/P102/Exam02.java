package P102;

import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pool = Integer.parseInt(console.nextLine());
        int firstPipe = Integer.parseInt(console.nextLine());
        int secondPipe = Integer.parseInt(console.nextLine());
        double hours = Double.parseDouble(console.nextLine());

        double pipeOne = firstPipe*hours;
        double pipeTwo = secondPipe*hours;
        double theDebit = pipeOne+pipeTwo;
        if (pipeOne+pipeTwo<=pool){
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.",(int)(theDebit/pool*100),(int)(pipeOne/theDebit*100),(int)(pipeTwo/theDebit*100));
        }
        else if (pipeOne+pipeTwo>pool){
            System.out.printf("For %.01f hours the pool overflows with %.1f liters.",hours,theDebit-pool);
        }
    }
}
