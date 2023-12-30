package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop143_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n ; i++){
            for(int k = 0; k<i ; k++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*n-1-2*i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i =0 ;i <n-1; i++){
            for(int j = n-2; j>i; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k < 3 + 2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
