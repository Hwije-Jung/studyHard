package javaStudy.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamdaTest {
  public static void main(String[] args) {
    //1. 제시되는 list를 오름차순으로 정렬하는 람다식을 작성하세요
    List<String> list = Arrays.asList("apple", "banana", "pear", "orange");

    list.sort((s1,s2)->s1.compareTo(s2)); // 이거 답

    //2. 문자열을 대문자로 변환하는 람다 표현식 작성
    Function<String,String> toUppercase = (str)->str.toUpperCase();
    Function<String,String> toLowercase = (str)->str.toLowerCase();
    System.out.println(toUppercase.apply("hello"));
    System.out.println(toLowercase.apply("HELLO"));

    //3. 문자열이 비어 있는지 확인하는 람다 표현식 작성
    Predicate<String> isEmpty = String::isEmpty;
    System.out.println(isEmpty.test(""));

    //4. 두 문자열을 연결하는 람다 표현식을 작성
    BiFunction<String,String,String> concatename = String::concat;
    System.out.println(concatename.apply("자바신세계","개발자과정"));

    //5. 숫자의 제곱을 계산하는 람다 식 작성
    Function<Integer,Integer> square = (number) -> number * number;
    System.out.println(square.apply(5));

  }
}
