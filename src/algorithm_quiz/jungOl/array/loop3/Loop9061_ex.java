package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop9061_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for(int i=1 ; i<=n; i++){
            for(int j=0; j<n-(n-i); j++){
                System.out.print(num++ +" ");

            }
            System.out.println();

        }
    }
}
