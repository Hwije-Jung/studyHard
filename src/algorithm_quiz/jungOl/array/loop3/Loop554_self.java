package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop554_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int eng = 65;

        for(int i = 0; i< n; i++){
            for (int j = n; j>i ; j--){
                System.out.print(num++ + " ");
            }
            for (int k = 0; k <= i; k++){
                System.out.print((char)eng++ + " ");
            }

            System.out.println();
        }
    }
}
