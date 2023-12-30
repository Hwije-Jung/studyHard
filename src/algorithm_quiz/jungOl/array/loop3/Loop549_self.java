package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop549_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i =1;
        int total = 0;
        int count = 0;

        while(total < n){
            total += i;
            i += 2;
            count ++;
        }

        System.out.println(count + " "+total);

    }
}
