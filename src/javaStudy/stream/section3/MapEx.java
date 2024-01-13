package javaStudy.stream.section3;

import java.util.Arrays;
import java.util.stream.IntStream;

//정수 스트림을 실수 스트림으로 변환, 기본 타입 스트림을 래퍼
public class MapEx {
  public static void main(String[] args) {
    //1. 정수형 배열 intArray 1,2,3,4,5 초기화
    int[] intArray = {1,2,3,4,5};

    //2. intArray를 intStream으로 생성해주세요.
    IntStream intStream = Arrays.stream(intArray);

    //3. intStream 객체를 double로
    intStream.asDoubleStream().forEach(System.out::println);

    System.out.println();

    // int타입을 wrapper객체로 변환 (Object 타입)
    intStream = Arrays.stream(intArray);
    intStream.boxed().forEach(obj-> System.out.println(obj.intValue()));
  }
}
