package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Loop9043_ex {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();

        StringTokenizer st = new StringTokenizer(s," ");

        int temp;
        int count=0;
        int total=0;
        while(st.hasMoreTokens()){
            temp = Integer.parseInt(st.nextToken());

            if(temp%2==1){
                total += temp;
                count++;
            }
            if(temp == 0){
                break;
            }
        }

        System.out.print("홀수의 합 = "+total);
        System.out.println();
        System.out.printf("홀수의 평균 = %d",total/count);

    }
}
