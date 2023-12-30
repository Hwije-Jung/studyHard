package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9116_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] nextLine = str.split(" ");

        for(String i : nextLine){
            System.out.println(i);
        }
    }
}
