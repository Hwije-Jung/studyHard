package algorithm_quiz.jungOl.array.output;

import java.util.Scanner;

public class _1307 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        char alph = (char) (64 + n * n);
        while (alph > 90) {
            alph -= 26;

        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n; i++) {
                if (alph < 65) {
                    System.out.print((char) (alph + 26) + " ");

                }
                else {
                    System.out.print((char) alph + " ");

                }
                alph -= n;

            }
            System.out.println();
            alph += n*n-1;

        }
    }
}
