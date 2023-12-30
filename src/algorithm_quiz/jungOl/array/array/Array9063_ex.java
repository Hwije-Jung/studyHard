package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9063_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0 ; i< 5; i++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0 ; i< 5; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}
