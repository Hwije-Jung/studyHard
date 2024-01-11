package javaStudy.stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx6 {
  //reduce() 최종연산: 프로그래머가 직접 지정하는 연산을 적용
  public static void main(String[] args) {
    List<String> names = Arrays.asList("김진성","강호동동동","신동엽","서장훈","정휘제");

    String name1 = names.stream()
            .reduce("이순신",(s1,s2)->s1.length()>= s2.length()?s1:s2);

    System.out.println(name1);

    List<Integer> numbers = Arrays.asList(10,2,34,5,6,3);
    //reduce()로 numbers의 누적합, 누적곱 출력하는 문장 구현 : 제출

    //누적 합
    System.out.println(numbers.stream().reduce(0,(x,y)->x+y));
    System.out.println(numbers.stream().reduce(0,Integer::sum));

    //누적 곱
    System.out.println(numbers.stream().reduce(1,(x,y)->x*y));



  }
}
