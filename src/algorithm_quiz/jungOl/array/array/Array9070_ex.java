package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9070_ex {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner sc = new Scanner(System.in);
        int max = 0;

        for(int i =0 ;i <10; i++){
            numbers[i] = sc.nextInt();
            if(max < numbers[i]){
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
