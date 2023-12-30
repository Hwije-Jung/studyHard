package algorithm_quiz.jungOl.array.loop2;

import java.util.Scanner;

public class Loop543_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1; i<n+1;i++){
            if( i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}
