package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop9042_ex {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int total=0;
        int count=0;
        int temp;

        String s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s);

        while(st.hasMoreTokens()){
            temp = Integer.parseInt(st.nextToken());
            if(temp == 0) break;
            total += temp;
            count ++;

        }

        System.out.print("입력된 자료의 개수 = "+count);
        System.out.println();
        System.out.print("입력된 자료의 합계 = "+total);
        System.out.println();
        System.out.printf("입력된 자료의 평균 = %.2f",total/(double)count);
    }
}
