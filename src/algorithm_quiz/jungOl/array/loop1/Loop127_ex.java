package algorithm_quiz.jungOl.array.loop1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop127_ex {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int total = 0;
        int num;
        int count = 0;

        String numbers = bf.readLine();

        StringTokenizer st = new StringTokenizer(numbers, " ");

        while (st.hasMoreTokens()) {
            num = Integer.parseInt(st.nextToken());

            if (num >= 0 && num <= 100) {
                total += num;
                count++;
            } else {
                break;
            }
        }


        System.out.println("sum : " + total);
        System.out.printf("avg : %.1f", total / (double) count);


    }
}
