package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop546_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        int score;
        int total = 0;

        for(int i=0; i<subjects; i++){
            score = sc.nextInt();
            total += score;
        }
        double avg = total/(double)subjects;

        System.out.printf("avg : %.1f\n",avg);
        if(avg>=80){
            System.out.println("pass");
        }
        else {
            System.out.println("fail");
        }

    }
}
