package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9122_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        if(strArray[0].length() > strArray[1].length()){
            System.out.println(strArray[1]);
            System.out.println(strArray[0]);
        }
        else {
            System.out.println(strArray[0]);
            System.out.println(strArray[1]);
        }

    }
}
