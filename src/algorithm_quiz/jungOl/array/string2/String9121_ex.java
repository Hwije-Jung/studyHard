package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9121_ex {
    public static void main(String[] args) {

        String[] strArray = new String[2];
        Scanner sc = new Scanner(System.in);

        strArray[0] = "champion";
        strArray[1] = "class";


        System.out.print("문자를 입력하세요. ");
        char ch = sc.next().charAt(0);

        for(int i = 0 ;i< strArray.length; i++){
            if (strArray[i].charAt(0)==ch){
                System.out.println(strArray[i]);
            }
            else {
                System.out.println("찾는 단어가 없습니다.");
            }
        }


    }
}
