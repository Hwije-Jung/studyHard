package algorithm_quiz.jungOl.array.string;

import java.util.Scanner;

public class String9108_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while(true){
            char ch = sc.next().charAt(0);

            System.out.println(ch+" "+"->"+" "+(int)ch);
            if(ch == '0'){
                break;
            }
        }
    }
}
