package algorithm_quiz.jungOl.array.array2;

import java.util.Scanner;

public class Array9079_ex {
    public static void main(String[] args) {
        int[][] students = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 학생의 점수 " );
        for(int i = 0; i<3 ; i++){
            students[0][i] = sc.nextInt();
        }
        System.out.print("2번째 학생의 점수 " );
        for(int i = 0; i<3 ; i++){
            students[1][i] = sc.nextInt();
        }
        System.out.print("3번째 학생의 점수 " );
        for(int i = 0; i<3 ; i++){
            students[2][i] = sc.nextInt();
        }

        int total=0;
        int korTotal = 0;
        int engTotal = 0;
        int matTotal = 0;

        System.out.println("     국어 영어 수학 총점");
        for(int i=0; i<3; i++){
            System.out.print(" "+(i+1)+"번 ");
            for(int j = 0 ;j<3 ; j++){
                System.out.printf("%3d ",students[i][j]);
                total += students[i][j];

            }
            korTotal += students[i][0];
            engTotal += students[i][1];
            matTotal += students[i][2];
            System.out.print(total);
            System.out.println();
            total = 0;
        }
        System.out.printf("합계 %d %d %d %d",korTotal,engTotal,matTotal,korTotal+engTotal+matTotal);
    }
}
