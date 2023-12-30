package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9112_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.printf("입력받은 문자열의 길이는 %d입니다.\n",str.length());

        for(int i = str.length()-1 ; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
