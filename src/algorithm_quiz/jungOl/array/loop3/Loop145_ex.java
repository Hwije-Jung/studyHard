package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop145_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(count++ + " ");
            }
            count = 1;
            System.out.println();
        }
    }
}
