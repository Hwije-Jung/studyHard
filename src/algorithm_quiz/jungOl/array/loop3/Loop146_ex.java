package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop146_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int eng = 65;
        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print((char) eng++ + " ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }

    }
}
