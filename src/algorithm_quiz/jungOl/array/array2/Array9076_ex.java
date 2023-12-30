package algorithm_quiz.jungOl.array.array2;

public class Array9076_ex {
    public static void main(String[] args) {
        int[] fibo = new int[50];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < 50; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
//            System.out.print(fi);
        }

        for (int i = 9; i < 40; i+=10) {
            System.out.println("피보나치 수열 "+(i+1)+"항 : "+fibo[i]);
        }
    }
}
