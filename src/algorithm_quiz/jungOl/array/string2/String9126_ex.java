package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9126_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        int correctCount = 0;

        for (int i = 0; i < 3; i++) {
            if (strArray[0].charAt(i) == strArray[1].charAt(i)) {
                correctCount++;
            }

        }
        for (int i = 0; i < 3; i++) {
            if (strArray[0].charAt(i) > strArray[1].charAt(i)) {
                System.out.println(strArray[0] + " 가(이) 더 큽니다.");
                break;
            } else {
                System.out.println(strArray[1] + " 가(이) 더 큽니다.");
                break;
            }

        }


        if (correctCount == 3) {
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }


    }
}
