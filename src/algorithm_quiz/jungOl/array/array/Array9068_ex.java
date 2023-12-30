package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9068_ex {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        Scanner sc = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i < 100; i++) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numbers[i] = num;
        }
        for(int i = 0 ; i< 100; i++){
            if(numbers[i] == 0){
                break;
            }
            if( i % 2 == 1){
                System.out.print(numbers[i]+" ");
            }
        }
    }
}
