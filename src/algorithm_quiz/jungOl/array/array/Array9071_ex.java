package algorithm_quiz.jungOl.array.array;

import java.util.Scanner;

public class Array9071_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        int evenMax = numbers[0];
        int oddMin = numbers[0];


        for(int i =0; i<10 ; i ++){
            numbers[i] = sc.nextInt();
        }
        for(int i = 0 ; i< 10; i++){
            if(numbers[i] % 2 == 0 && evenMax<numbers[i]){
                evenMax = numbers[i];
            }
            else if(numbers[i] % 2 == -1 && oddMin>numbers[i]){
                oddMin = numbers[i];
            }

        }

        System.out.print(oddMin+" "+evenMax);


    }
}
