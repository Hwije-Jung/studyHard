package algorithm_quiz.jungOl.array.output;

import java.util.Scanner;

public class _1304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num = 1;
        int count =1;

        while(true){
            for (int i = 0; i < n; i++) {
                System.out.print(num + " ");
                num += n;
            }
            System.out.println();
            count ++;
            num = count;
            if(count == n+1) break;
        }



    }
}
