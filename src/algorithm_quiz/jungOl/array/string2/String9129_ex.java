package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String9129_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        String str;
        Double number;

        for(int i = 0 ;i<3 ; i++){
            number = sc.nextDouble();
//            number = Math.round(number*100)/100.0;
//            System.out.println(number);
//            sb.append(number);

            str = String.format("%.2f", number);
            sb.append(str);

        }

        String str2 = sb.toString();
//str2.concat()


        StringTokenizer st = new StringTokenizer(str2,".");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

    }
}