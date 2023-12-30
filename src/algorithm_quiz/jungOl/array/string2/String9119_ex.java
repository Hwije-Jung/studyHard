package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9119_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] strArray = str.split(" ");
        for(String s : strArray){
            System.out.println(s);
        }
        
    }
}
