package algorithm_quiz.jungOl.array.loop1;


import java.util.stream.IntStream;

public class Loop9039_ex {
    public static void main(String[] args) {

        IntStream.range(65,91).map(i->i+30).forEach(i->System.out.print((char)i));
    }
}
