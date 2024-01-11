package javaStudy.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamEx5 {
  public static void main(String[] args) {
    List<String> list = Arrays.asList("apple","pear","orange","banana","tomato");

    //list의 문자열을 대문자로 변환하여 출력하세요.
    list.stream().map(String::toUpperCase).forEach(System.out::println);

    //list의 문자열을 소문자로 변환하여 출력하세요
    // steam은 원본을 해치지 않기 때문에 따로 해줄 게 없음
    list.stream().forEach(System.out::println);
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,5,4,456,432,13);

    //1. of메소드를 이용하여 직접 입력해 입력스트림을 만들 수 있습니다. 합계 구하기
    int total = IntStream.of(1,3,5,7,8).sum();
    System.out.println(total);

    int total2 = numbers.stream().mapToInt(Integer::intValue).sum();
    System.out.println(total2);

    int total3 = IntStream.of(numbers.stream()
            .mapToInt(Integer::intValue).toArray()).sum();

    //2. 스트림 데이터 개수를 세는 최종 연산을 합니다. count() long 반환
    long count = IntStream.of(3,4,5,6,6,4,3).count();

    //3. 스트림 데이터 평균을 구하는 최종 연산을 합니다.
    double avg = IntStream.of(2,3,45,6,4).mapToDouble(Double::valueOf)
            .average()
            .orElse(0.0);

    IntStream.of(2,3,45,5,5,6,2).average()
            .ifPresent(av-> System.out.println("average : "+av));
    //ifPresent 값이 만약에있으면 정해전 포맷으로 출력
    System.out.println(avg);

    //4. 스트림 데이터의 최솟값을 구하는 최종 연산을 합니다.
    IntStream.of(2,45,6,7,4).min()
            .ifPresent(min-> System.out.println("최소값: "+min));


  }

}
