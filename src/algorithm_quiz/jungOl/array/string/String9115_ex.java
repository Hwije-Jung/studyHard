package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9115_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for (int i =0; i< str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>=65 && ch<=90){
                System.out.print(Character.toLowerCase(ch));
            }
            else if(ch>=97 && 122>=ch){
                System.out.print(Character.toUpperCase(ch));
            }
            else {
                System.out.println(ch);
            }

        }

    }
}
