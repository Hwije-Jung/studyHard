package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop134_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num ;
        int oddCount = 0;
        int evenCount = 0;

        for(int i =0 ;i <10;i++){
            num = sc.nextInt();
            if(num %2 ==0){
                evenCount++;
            }
            if(num %2 ==1){
                oddCount++;
            }
        }
        System.out.println("even : "+evenCount);
        System.out.println("odd : "+oddCount);
    }
}
