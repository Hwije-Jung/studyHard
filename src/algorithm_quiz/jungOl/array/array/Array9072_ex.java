package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9072_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int total = 0;

        for(int i =0 ;i<10 ; i++){
            numbers[i] = sc.nextInt();
            total += numbers[i];
        }

        System.out.println("총점 = "+total);
        System.out.printf("평균 = %.1f",total/10.0);
    }
}
