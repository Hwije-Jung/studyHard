package algorithm_quiz.jungOl.array.array2;

import java.util.Scanner;

public class Array9078_ex {
    public static void main(String[] args) {
        int[][] numbers1 = new int[3][3];
        int[][] numbers2 = new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 배열 1행 ");
        for (int i = 0; i < 3; i++) {

            numbers1[0][i] = sc.nextInt();
        }
        System.out.print("첫 번째 배열 2행 ");
        for (int i = 0; i < 3; i++) {

            numbers1[1][i] = sc.nextInt();
        }
        System.out.print("첫 번째 배열 3행 ");
        for (int i = 0; i < 3; i++) {

            numbers1[2][i] = sc.nextInt();
        }
        System.out.print("두 번째 배열 1행 ");
        for (int i = 0; i < 3; i++) {

            numbers2[0][i] = sc.nextInt();
        }
        System.out.print("두 번째 배열 2행 ");
        for (int i = 0; i < 3; i++) {

            numbers2[1][i] = sc.nextInt();
        }
        System.out.print("두 번째 배열 3행 ");
        for (int i = 0; i < 3; i++) {

            numbers2[2][i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(numbers1[i][j] + numbers2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
