package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9125_ex {
    public static void main(String[] args) {
        String[] strArray =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("문자를 입력하세요. ");
            String ch = sc.nextLine();
            int sameCount = 0;

            for(int i = 0 ;i<strArray.length ; i++){
                if(strArray[i].contains(ch)){
                    System.out.println(strArray[i]);
                    sameCount++;
                }
            }
            if(sameCount == 0) break;
            System.out.println();
        }
    }
}
