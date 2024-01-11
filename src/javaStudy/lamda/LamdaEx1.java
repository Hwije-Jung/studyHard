package javaStudy.lamda;

import java.util.Arrays;
import java.util.List;

public class LamdaEx1 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

    int sumOfEvenNumbers = numbers.stream()
            .filter(number->number % 2 == 0)
            .mapToInt(Integer::intValue)
            //스트림을 IntStream으로 변환해주는 메소드
            .sum();
    System.out.println("Sum of even numbers:"+ sumOfEvenNumbers);
  }
}
