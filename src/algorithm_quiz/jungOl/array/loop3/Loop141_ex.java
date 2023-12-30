package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop141_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;
        int count = 1;

        while (true) {
            num = n * count;
            if(num >= 100) break;
            System.out.print(num+" ");
            if (num % 10 == 0) break;

            count++;
        }
    }
}
