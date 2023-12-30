package algorithm_quiz.jungOl.array.array2;

import java.util.Scanner;

public class Array9074_ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int num ;



        for(int i=0; i<10 ; i++){
            num = sc.nextInt();
            if(num == 0){
                break;
            }
            numbers[num-1] +=1;
        }

        for(int i = 0 ; i<10 ; i++){
            if(numbers[i] != 0){
                System.out.println((i+1)+" : "+numbers[i]+"개");

            }
        }


    }
}
