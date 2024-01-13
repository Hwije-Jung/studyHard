package javaStudy.stream.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Optional {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    OptionalDouble optionalDouble = list.stream()
            .mapToInt(Integer::intValue).average();

    //Optional 처리 방법 1
    // 만약에 표현할게 있다고 하면
    if(optionalDouble.isPresent()){
      System.out.println("평균 :"+optionalDouble.getAsDouble());
    }else {
      System.out.println("평균 :"+0.0);
    }

    //Optional 처리 방법 2
    double avg = list.stream()
            .mapToInt(Integer::intValue).average().orElse(0.0);
    System.out.println(avg);

    //Optional 처리 방법 3
    list.stream().mapToInt(Integer::intValue).average()
            .ifPresent(average -> System.out.println("방법3 avg: "+average));

  }
}
