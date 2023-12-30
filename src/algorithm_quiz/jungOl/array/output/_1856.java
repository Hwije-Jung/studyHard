package algorithm_quiz.jungOl.array.output;

import java.util.Scanner;

public class _1856 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num = 1;
        int count =0;

        while(true){
            for (int i = 0; i < m; i++) {
                System.out.print(num + " ");
                num++;
            }
            count ++;
            System.out.println();
            num += (m - 1);
            if(count == n) break;

            for (int j = 0; j < m; j++) {
                System.out.print(num + " ");
                num--;
            }
            count++;
            System.out.println();
            num += (m + 1);
            if(count == n) break;
        }




    }
}
