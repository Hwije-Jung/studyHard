package algorithm_quiz.jungOl.array.loop3;


import java.util.Scanner;

public class Loop634_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-i;j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
