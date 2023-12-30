package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop9052_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score;
        int total=0;

        for(int i =0 ;i <5; i++){
            score = sc.nextInt();
            total += score;
        }

        System.out.println("총점 : "+total);
        System.out.printf("평균 : %.1f",total/5.0);
    }
}
