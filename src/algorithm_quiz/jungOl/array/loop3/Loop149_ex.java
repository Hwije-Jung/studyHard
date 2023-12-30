package algorithm_quiz.jungOl.array.loop3;

import java.util.Scanner;

public class Loop149_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = {1,3,5,7,9};
        int index = 0;

        for(int i = 0; i<n; i++){
            for(int j = 0 ; j<n; j++){
                System.out.print(array[index++]+" ");
                if(index == 5){
                    index = 0;
                }

            }
            System.out.println();
        }
    }
}
