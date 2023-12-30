package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop9050_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int total=0;

        for(int i =0; i<=n; i++){
            total+=i;
        }

        System.out.println(total);

    }
}
