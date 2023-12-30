package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop545_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int count3=0;
        int count5=0;

        for(int i=0; i<10; i++){
            num = sc.nextInt();

            if(num %3 ==0){
                count3++;
            }
            if(num %5 ==0){
                count5++;
            }
        }
        System.out.println("Multiples of 3 : "+count3);
        System.out.println("Multiples of 5 : "+count5);
    }
}
