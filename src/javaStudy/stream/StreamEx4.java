package javaStudy.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx4 {
  public static void main(String[] args) {
    //1. sorted() : 스트림을 구성하는 데이터를 조건에 따라 정렬하는 연산
    List<String> stringList = Arrays.asList("홍길동 제주도 도망","풍자 먹찌빠","강호동 아는형님","유재석 유퀴즈 온더 블록","서장훈 미운오리새끼","신동엽 토요일이 즐겁다");

    //2. stream객체 사전순으로 정렬해 주세요.

    stringList.stream().sorted().forEach(System.out::println);

    Stream<String> s1 = stringList.stream();
    s1.sorted().forEach(System.out::println);

    System.out.println(stringList.stream().sorted(Comparator.comparing(str->str))
            .collect(Collectors.toList()));

    List<String> collect = stringList.stream().sorted().collect(Collectors.toList());
    System.out.println(collect);

    Collections.sort(stringList); // stream객체는 아님

    //3. stream객체로 변환하여 글자 길이순으로 정렬해 주세요
    stringList.stream().sorted(Comparator.comparing(String::length))
            .toList()
            .forEach(System.out::println);

    stringList.stream().sorted((str1,str2)->str2.length() - str1.length()).forEach(System.out::println);

    List<String> newStr1 = stringList.stream().sorted().sorted(Comparator.comparing(str->str.length())).toList();
    System.out.println(newStr1);
  }
}
