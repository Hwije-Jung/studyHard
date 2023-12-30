package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop9055_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int i = 0;
        int total = 0;

        while (total <= num) {
            i++;
            total += i;
        }

        System.out.println(i+" "+total);
    }
}
