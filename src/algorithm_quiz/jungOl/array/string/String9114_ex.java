package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9114_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            char ch = sc.next().charAt(0);
            if((int)ch >= 97 && (int)ch<=122){
                System.out.println("소문자입니다.");
            }
            else if((int)ch >=65 && (int)ch <= 90){
                System.out.println("대문자입니다.");
            }
            else if((int)ch >= 48 && (int)ch<=57){
                System.out.println("숫자문자입니다.");
            }
            else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
