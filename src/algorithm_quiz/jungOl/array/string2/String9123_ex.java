package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9123_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split(" ");

//        String temp = strArray[0];
//        strArray[0] = strArray[1];
//        strArray[1] = temp;

        System.out.println(strArray[1]+strArray[0]);

    }
}
