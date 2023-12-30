package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loop540_self {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int num;

        while (true) {

            num = Integer.parseInt(bf.readLine());

            if (num % 3 == 0) {
                System.out.println(num / 3);
            }
            System.out.println();
            if (num == -1) {
                break;
            }
        }
    }
}
