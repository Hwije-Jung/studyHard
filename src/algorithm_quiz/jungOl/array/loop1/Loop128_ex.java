package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop128_ex {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int num;
        int count = 0;
        String numbers = bf.readLine();

        StringTokenizer st = new StringTokenizer(numbers, " ");
        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());

            if (num == 0) {
                break;
            }

            if (num % 3 != 0 && num % 5 != 0) {
                count++;
            }


        }
        System.out.println(count);

    }
}
