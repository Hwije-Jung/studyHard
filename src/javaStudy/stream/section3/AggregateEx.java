package javaStudy.stream.section3;

import java.util.Arrays;

// 카운팅, 총합, 평균, 최댓값, 최솟값, 첫번째 요소
public class AggregateEx {
  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,7,8,9,10};

    //1. 카운팅
    System.out.println(Arrays.stream(array).count());

    //2. 총합
    System.out.println(Arrays.stream(array).sum());

    //3. 평균
    System.out.println(Arrays.stream(array).average().orElse(0.0));

    //4. 최댓값
    System.out.println(Arrays.stream(array).max().orElse(0));

    //5. 최솟값
    System.out.println(Arrays.stream(array).min().getAsInt());

    //6. 첫요소 추출
    System.out.println(Arrays.stream(array).findFirst().getAsInt());
  }
}
