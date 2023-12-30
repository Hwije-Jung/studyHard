package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop147_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for(int i = 0; i<n; i++){
            for(int k=0; k<2*i; k++){
                System.out.print(" ");
            }
            for(int j = 0 ; j<n-i; j++){
                System.out.print(num++ + " ");
            }

            System.out.println();
        }
    }
}
