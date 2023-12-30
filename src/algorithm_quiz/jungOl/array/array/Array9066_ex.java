package algorithm_quiz.jungOl.array.array;

public class Array9066_ex {
    public static void main(String[] args) {

        char[] array = new char[26];
        int alphbet = 65;

        for (int i = 0; i<26; i ++){
            array[i] = (char)alphbet++;
        }

        for(int i = array.length-1 ; i >=0; i--){
            System.out.print(array[i]+" ");
        }


    }
}
