package javaStudy.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaEx4 {
  public static void main(String[] args) {
    //1. map()
    //스트림api 컬렉션에서 다양한 연산을 수행하기 위해 람다 표현식을 허용하는 메서드를 제공한다.
    //스트림의 요소를 다른 유형으로 변환하는데 사용
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    List<Integer> squaredNumber = numbers.stream().map(n -> n * n).collect(Collectors.toList());
    System.out.println(squaredNumber);

    //2.filter()
    //조건에 따라 스트림에서 요소를 선택하는데 사용(조건을 정의하는 람다 표현식을 인수로 받는다)
    // 2-1. numbers 대상으로 홀수리스트 oodNumber구성하여 출력
    List<Integer> oodNumber1 = numbers.stream().filter(num -> num % 2 == 1).toList();
    System.out.println(oodNumber1);

    List<Integer> oodNumber2 = numbers.stream().filter(num -> num % 2 == 1).collect(Collectors.toList());
    System.out.println(oodNumber2);

    // 2-2 nubers 대상으로 짝수 리스트 evenNumber구성하여 출력
    List<Integer> evenNumber = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
    System.out.println(evenNumber);

    //3. 집계함수 : reduce() : 스트림의 요소를 단일 값으로 집계하는 데 사용(축소 연산)
    int total = numbers.stream().reduce(0, (x, y) -> x + y);
    System.out.println("numbers의 총합 집계" + total);

    //4. forEach() : 스트림의 요소를 반복하고, 각 요소에 대해 작업을 수행하는데 사용(수행 작업을 하는 람다 표현식을 인수로 받는다)
    numbers.stream().forEach(number -> System.out.println(number));
    numbers.forEach(number -> System.out.println(number));

    //응용 문제/ 스트림 API를 사용하여 리스트 numbers의 평균을 구하는 람다식 작성하세요
    double average = numbers.stream()
            .mapToDouble(Integer::doubleValue)
            //double로 형변환
            .average()
            // 이걸쓰면 optional double이 됨
            //Optional이란? 자바에서 Null 참조시 NullPointerException을 방지해주는 클래스
            //optional double 이기 때문에 보통 double로 바꿔주는 getAsDouble사용함
            .orElse(0.0);
            //Optional에 올 값이 null인 경우 orElse 안에 있는 내용을 실행 시킨다.

    System.out.println(average);
  }

}
