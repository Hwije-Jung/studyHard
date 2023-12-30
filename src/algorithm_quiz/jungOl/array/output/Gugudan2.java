package algorithm_quiz.jungOl.array.output;
import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        if(s>=e){
            for(int j = s;j>=e;j--){
                for(int i=1; i<4; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }
                System.out.println();
                for(int i=4; i<7; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }
                System.out.println();
                for(int i=7; i<10; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }

                System.out.println("\n");
            }
        }
        else{
            for(int j = s;j<=e;j++){
                for(int i=1; i<4; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }
                System.out.println();
                for(int i=4; i<7; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }
                System.out.println();
                for(int i=7; i<10; i++){
                    System.out.printf(j+" * "+i+" =%3d   ",(j*i));
                }

                System.out.println("\n");
            }

        }







    }
}
