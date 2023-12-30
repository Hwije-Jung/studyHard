package algorithm_quiz.jungOl.array.loop3;

public class Loop9060_ex {
    public static void main(String[] args) {
        for(int i =0; i<5; i++){
            for(int j=1; j<5-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(1+2*i); k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
