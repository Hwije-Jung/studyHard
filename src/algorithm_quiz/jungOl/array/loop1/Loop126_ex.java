package algorithm_quiz.jungOl.array.loop1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Loop126_ex {
    public static void main(String[] args) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String numbers = bf.readLine();

        StringTokenizer st = new StringTokenizer(numbers, " ");

        int num=0;
        int oddCount =0;
        int evenCount =0;

        while(st.hasMoreTokens()){
            num = Integer.parseInt(st.nextToken());

            if(num == 0){
                break;
            }
            if(num %2 ==0){
                evenCount++;
            }
            if(num %2 == 1){
                oddCount++;
            }
        }

        System.out.println("odd : "+oddCount);
        System.out.println("even : "+evenCount);

    }
}
