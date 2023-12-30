package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Loop539_self {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = bf.readLine();
        int total = 0;
        int count = 0;
        int temp;
        StringTokenizer st = new StringTokenizer(s," ");

        while(st.hasMoreTokens()){
            temp = Integer.parseInt(st.nextToken());
            total+=temp;
            count++;
            if(temp>=100) break;
        }

        System.out.println(total);
        System.out.printf("%.1f",total/(double)count);
    }
}
