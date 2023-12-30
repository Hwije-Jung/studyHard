package algorithm_quiz.jungOl.array.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Array9074_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numbers = new int[2][10];
        int num = -1;
        int temp;

        for (int i = 0; i < 10; i++) {
            numbers[0][i] = i + 1;
            numbers[1][i] = 0;

        }

        for (int i = 0; i < 10; i++) {

            num = sc.nextInt();
            for (int j = 0; j < 10; j++) {
                if (numbers[0][i] == num) {
                    numbers[1][i] += 1;
                }

            }

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[1][i] + " ");

        }

        System.out.println();

        for (int i = 0; i < 10; i++) {

            if (numbers[1][i] != 0){
                System.out.println(numbers[0][i]+" : "+numbers[1][i]+"개");
            }
        }

    }
}
