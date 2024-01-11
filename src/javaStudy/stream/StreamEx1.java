package javaStudy.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx1 {
  public static void main(String[] args) {
    //1. 정수형 배열 array 생성하고 1,2,3,4,5 로 초기화 하세요
    int[] array = {1,2,3,4,5};

    //2. array배열에 스트림 객체 stm1 을 생성하세요
    IntStream stm1 = Arrays.stream(array);
    Stream<Integer> stm11 = Arrays.stream(array).boxed();

    //3. 중간연산 스트림객체 stm1에 대해 홀수만 추출해서 스트림객체 stm2에 저장하세요
    IntStream stm2 = stm1.filter(a -> a%2==1);
    Stream<Integer> stm22 = stm11.filter(a -> a%2==1);

    //4. stm2 스트림객체의 총합을 구하세요
    int sum = stm2.sum();
    //int total = stm22.collect(Collectors.summingInt(Integer::intValue));
    int total = stm22.mapToInt(Integer::intValue).sum();
    //5. 출력하세요
    System.out.println(sum);
    System.out.println(total);
  }
}
