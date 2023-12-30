package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop633_self {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num;

        while (true) {
            System.out.println("1. Korea");
            System.out.println("2. USA");
            System.out.println("3. Japan");
            System.out.println("4. China");
            System.out.print("number? ");

            num = Integer.parseInt(bf.readLine());
            System.out.println();

            if (num == 1) {
                System.out.println("Seoul");
            } else if (num == 2) {
                System.out.println("Washington");
            } else if (num == 3) {
                System.out.println("Tokyo");
            }else if(num == 4){
                System.out.println("Beijing");
            }else{
                System.out.println("none");
                break;
            }
            System.out.println();


        }
    }
}
