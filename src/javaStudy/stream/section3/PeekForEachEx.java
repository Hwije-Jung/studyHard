package javaStudy.stream.section3;

import javax.accessibility.AccessibleRole;
import java.util.Arrays;

//요소 루핑: peek() : 중간처리 메소드, foreach() : 최종처리 메소드
public class PeekForEachEx {
  public static void main(String[] args) {
    int[] intArray = {1,2,3,4,5};

    //최종처리가 아니기때문에 결과가 안나옴
    Arrays.stream(intArray).filter(number->number%2==0).peek(n-> System.out.println(n));

    // 디버깅용 작업한내용 눈으로 확인용, peek 출력
    // 마지막 sum 출력
    int total = Arrays.stream(intArray).filter(number->number%2==0).peek(n-> System.out.println(n)).sum();
    System.out.println(total);
  }
}
