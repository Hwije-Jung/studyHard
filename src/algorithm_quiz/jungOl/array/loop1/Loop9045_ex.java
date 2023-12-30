package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop9045_ex {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num;

        while (true) {
            System.out.println("1. 입력하기");
            System.out.println("2. 출력하기");
            System.out.println("3. 삭제하기");
            System.out.println("4. 끝내기");
            System.out.print("작업할 번호를 선택하세요. ");
            System.out.println();
            num = Integer.parseInt(bf.readLine());

            if (num == 1) {
                System.out.println("입력하기를 선택하였습니다.");
            } else if (num == 2) {
                System.out.println("출력하기를 선택하였습니다.");
            } else if (num == 3) {
                System.out.println("삭제하기를 선택하였습니다.");
            } else if (num == 4) {
                System.out.println("끝내기를 선택하였습니다.");
                break;
            } else {
                System.out.println("잘못 입력하였습니다.");
            }


        }


    }
}
