package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop135_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);

        int total = 0;
        int count = 0;

        for(int i = min ; i <= max ; i++){
            if( i %3 ==0 || i%5==0){
                total += i;
                count ++;

            }
        }
        System.out.println("sum : "+total);
        System.out.printf("avg : %.1f",total/(double)count);
    }
}
