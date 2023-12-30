package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop133_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int number;
        int total = 0;

        for(int i =0 ;i <n ; i++){
            number = sc.nextInt();
            total += number;
        }

        System.out.printf("%.2f",(total/(double)n));
    }
}
