package javaStudy.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@FunctionalInterface
interface MathOperation {
  int calculate(int a, int b);
}

interface StringOperation {
  int getLength(String string);
}

interface ArrayOperation{
  int calculateSum(int[] numbers);
  // 정수 배열을 받아 모든 홀수의 합을 반환하는 람다식, 결과 출력 작성
}

//정수 리스트를 받아 최대값을 반환하는 람다식을 작성
interface FindMax{
  int getMax(List<Integer> numbers);
}

public class LamdaEx2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MathOperation addition = (a, b) -> a + b;
    //원할때마다 바꿔서 사용할 수 있다.
    int result = addition.calculate(5, 3);
    System.out.println("Result : " + result);

    //문자열의 길이를 반환하는 람다식 작성
    StringOperation leng = (string)->string.length();

    //람다식 데이터를 전달한 후 반환 처리 구문 작성
    int hiLength = leng.getLength("hi");

    //결과 출력
    System.out.println("length: "+hiLength);

    //---
    int[] array = {1,2,3,};
    ArrayOperation sumArray = (numbers)-> Arrays.stream(numbers).filter(number -> number%2 == 1).sum();
    System.out.println("배열 합 "+sumArray.calculateSum(array));

    //---
    FindMax findMax = (numbers)->{
      int maxNumber = Integer.MIN_VALUE;
      for(int number : numbers){
        if(number > maxNumber){
          maxNumber = number;
        }
      }
      return maxNumber;
    };

    List<Integer> numberList = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      numberList.add(sc.nextInt());
    }

    System.out.println(findMax.getMax(numberList));




  }
}
