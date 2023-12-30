package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9111_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String jo = "jungol olympiad";
        int num ;

        for(int i = 0 ; i<5; i++){
            num = sc.nextInt();
            System.out.print(jo.charAt(num));

        }

    }
}
