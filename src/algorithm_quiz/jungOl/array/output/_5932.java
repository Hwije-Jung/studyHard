package algorithm_quiz.jungOl.array.output;

import java.util.Scanner;

public class _5932 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;
        int count = 1;

        while(true) {
            for (int j = 0; j < n; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            num--;
            count++;
            if(count ==n+1) break;

            for (int j = n; j> 0; j--){
                System.out.print(num+" ");
                num--;
            }
            System.out.println();
            num++;
            count ++;
            if(count ==n+1) break;

        }

    }
}
