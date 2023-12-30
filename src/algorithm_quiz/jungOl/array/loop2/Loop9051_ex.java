package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop9051_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int count = 0;

        for (int i =0 ; i<10 ;i ++){
            num = sc.nextInt();

            if(num%2 == 0){
                count ++;
            }
        }

        System.out.println("입력받은 짝수는 "+count+"개입니다.");
    }
}
