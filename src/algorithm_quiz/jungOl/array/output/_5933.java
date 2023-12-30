package algorithm_quiz.jungOl.array.output;

import java.util.Scanner;

public class _5933 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;
        int x = 1;

        for(int j=0; j<n; j++){
            for(int i=0; i< n; i++){
                System.out.print(num+" ");
                num+=x;
            }
            x++;
            num = x;

            System.out.println();
        }



    }
}
