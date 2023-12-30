package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9067_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i=0; i<10; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println(numbers[2]+" "+numbers[4]+" "+numbers[9]);
    }
}
