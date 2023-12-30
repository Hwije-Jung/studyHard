package algorithm_quiz.jungOl.array.loop3;

public class Loop9062_ex {
    public static void main(String[] args) {

        int eng = 97;
        int num = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) eng++ +" ");
            }
            for (int k = 4; k > i; k--) {
                System.out.print(num++ +" ");
            }
            if(i ==3){
                break;
            }
            System.out.println();
        }
    }
}
