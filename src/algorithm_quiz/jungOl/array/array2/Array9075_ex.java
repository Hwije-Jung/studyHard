package algorithm_quiz.jungOl.array.array2;

import java.util.Scanner;

public class Array9075_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        for(int i = 0 ;i<10 ; i++){
            numbers[i] = 0;
        }

        int num;

        for(int i = 0 ; i<10 ; i++){

            num = sc.nextInt();

            if(num == 0) break;

            num %=10;

            numbers[num] ++;
        }

        for(int i = 0 ; i<10; i++){
            if(numbers[i] >= 1){
                System.out.println(i+" : "+numbers[i]+"개");

            }
        }

    }
}
