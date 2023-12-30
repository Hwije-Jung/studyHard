package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9124_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] strArray = str.split(" ");

        System.out.println(strArray[1].substring(0,3)+strArray[0].substring(3,strArray[0].length()));
        System.out.println(strArray[1]+strArray[0].substring(0,3));

    }
}
