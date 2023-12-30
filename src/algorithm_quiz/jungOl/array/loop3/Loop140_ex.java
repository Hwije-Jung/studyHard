package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop140_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int count = 0;
        int num = 0;

        for(int i =0 ;i <20 ;i++){
            num = sc.nextInt();
            if(num == 0) break;

            total += num;
            count ++;

        }
        System.out.println(total + " "+ total/count);
    }
}
