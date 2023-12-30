package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop132_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num= sc.nextInt();
        int total = 0;

        for(int i= 1 ;i <=num; i++){
            if(i % 5 == 0){
                total += i;
            }
        }

        System.out.println(total);
    }
}
