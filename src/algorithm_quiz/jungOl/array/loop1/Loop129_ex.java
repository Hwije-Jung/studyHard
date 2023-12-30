package algorithm_quiz.jungOl.array.loop1;

import java.util.Scanner;
public class Loop129_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int width;
        int height;
        String YN;

        while (true){
            System.out.print("Base = ");
            width = sc.nextInt();
            System.out.print("Height = ");
            height = sc.nextInt();
            System.out.printf("Triangle width = %.1f\n",width*height/2.0);
            System.out.print("Continue? ");

                YN = sc.next();

            if(!YN.equalsIgnoreCase("y")){
                break;
            }

        }

    }
}
