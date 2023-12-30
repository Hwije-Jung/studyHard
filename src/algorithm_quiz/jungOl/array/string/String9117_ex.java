package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9117_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        for(int i = 0; i<str.length();i++){
            for(int j = 0 ; j<str.length(); j++){
                System.out.print(str.charAt((str.length()+j+i+1)%str.length()));

            }
            System.out.println();
        }
    }
}
