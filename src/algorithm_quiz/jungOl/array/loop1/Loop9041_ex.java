package algorithm_quiz.jungOl.array.loop1;


import java.util.Scanner;

public class Loop9041_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        while (true) {
            System.out.print("점수를 입력하세요. ");
            score = sc.nextInt();
            if (score < 0 || score > 100) {
                break;
            } else if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
            }
        }
    }
}
