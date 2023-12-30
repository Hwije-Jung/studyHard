package algorithm_quiz.jungOl.array.loop1;

import java.util.Scanner;

interface sumInter{
    public int sumf(int n);
}

public class Loop537_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        sumInter sum = (num)->{
            int i =1;
            int total=0;
            while(i<=num){
                total += i;
                i++;
            }

            return total;

        };

        System.out.println(sum.sumf(n));


//        int i = 1;
//
//        int total = 0;
//        while(i<=n){
//            total += i;
//            i++;
//        }
//        System.out.println(total);

    }
}
