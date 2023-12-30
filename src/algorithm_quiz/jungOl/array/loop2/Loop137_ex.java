package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop137_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count = 1;

        for(int i=1; i<=num1; i++){
            for(int j =1; j<=num2 ; j++){
                System.out.print(j*count+" ");
            }
            count++;
            System.out.println();
        }

    }
}
