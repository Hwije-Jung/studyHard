package algorithm_quiz.jungOl.array.loop3;

public class Loop9057_ex {
    public static void main(String[] args) {
        for(int i =0; i<3; i++){
            for(int j = 3-i; j<=3 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<3; i++){
            for(int j=3-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
