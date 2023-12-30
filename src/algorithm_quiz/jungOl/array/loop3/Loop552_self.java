package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop552_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*n -1 - i*2; j++) {

                System.out.print("*");
            }

            if(i==n-1){
                break;
            }
            System.out.println();

        }
    }
}
