package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop553_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int eng = 65;

        for(int i=0; i<n; i++){
            for(int j=n ; j>i; j--){
                System.out.print((char)eng++);
            }

            if(i == n-1){
                break;
            }
            System.out.println();
        }


    }
}
