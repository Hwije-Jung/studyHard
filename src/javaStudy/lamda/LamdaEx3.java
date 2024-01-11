package javaStudy.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface Product{
  int calculate(List<Integer> numbers);
}
public class LamdaEx3 {
  public static void main(String[] args) {
    //1.정수형 리스트를 numbers를 생성하세요. 리스트의 순서는 1,2,3,4,5입니다.

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

    //2.numbers의 값을 순서대로 출력하는 람다식을 작성하세요.
    numbers.forEach((number) -> { // 하나씪 가져와서 블럭안으로 보낸다.
      System.out.println(number);
    });

    //3. stream API reduce + 람다식 = 누적 곱 구하기
    //reduce 누적
    Product product = products->numbers.stream().reduce(1,(a,b)->a*b);
    List<Integer> list = List.of(2,3,4);
    System.out.println(product.calculate(list));

    //4. 이름 리스트를 알파벳 순서로 정렬하세요
    List<String> names = Arrays.asList("John","Jane","Adam","Eve");
//    Collectors.sort(names,new Comparator<String>(){
//      public int compare(String a, String b){
//        return a.compareTo(b);
//      }
//    });
//
//    Collections.sort(names.(a,b)->a.compareTo(b));

    //5. 문자열 리스트 names를 대문자로 변환하는 람다식을 작성하세요
    List<String> upperCaseNames = names.stream()
            .map(name -> name.toUpperCase()) // 스트림을 변환시켰기때문에
            .collect(Collectors.toList()); // 리스트로 수집
    System.out.println(upperCaseNames);

    //매개변수와 반환값이 없는 람다식

  }
}

