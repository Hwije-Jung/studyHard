package javaStudy.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamEx3 {
  public static void main(String[] args) {
    int[] array = {1, 5, 3, 2, 4};
    List<Integer> list = new ArrayList<>();

    //foreach를 이용하여 array의 숫자를 list에 추가하되 홀수만 추가해 주세요

    for (int i: array ) {
      if(i%2==1){
        list.add(i);
      }
    }
    Arrays.stream(array).filter(n->n%2==1).sorted().forEach(a->list.add(a));

    Collections.sort(list); // ARrays.sort 아님

    for (int i: array ) {
      System.out.println(i);
    }

    Arrays.stream(array).filter(n->n%2==1).sorted()
            .forEach(n-> System.out.println(n+"\t"));
  }
}
