package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop144_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();

        for(int i = 0 ; i<n; i++){
            for(int j = 2*n - 2*(i+1);j>0;j-- ){
                System.out.print(" ");
            }
            for(int k = 0; k<2*i+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
