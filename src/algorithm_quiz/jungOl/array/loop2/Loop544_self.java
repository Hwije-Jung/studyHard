package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop544_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total = 0;

        for(int i =n ;i<101;i++){
            total += i;
        }

        System.out.println(total);
    }
}
