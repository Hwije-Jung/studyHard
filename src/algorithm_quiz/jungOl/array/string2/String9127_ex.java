package algorithm_quiz.jungOl.array.string2;

import java.util.Arrays;
import java.util.Scanner;

public class String9127_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArray = new String[5];

        System.out.println("단어 5개를 입력하세요.");
        for(int i=0; i<5 ; i++){
            strArray[i] = sc.nextLine();
        }
        Arrays.sort(strArray);
        for (int i = 0; i < 5; i++) {
            System.out.println(strArray[i]);
        }

    }
}
