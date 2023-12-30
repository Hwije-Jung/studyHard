package algorithm_quiz.jungOl.array.loop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Loop538_self {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        String s;
        int n;


        while(true){
            System.out.print("number? ");

            n = Integer.parseInt(bf.readLine());

            if(n >0){
                System.out.println("positive integer");
            }
            if(n<0){
                System.out.println("negative number");
            }
            if(n == 0){
                break;
            }

        }




    }
}
