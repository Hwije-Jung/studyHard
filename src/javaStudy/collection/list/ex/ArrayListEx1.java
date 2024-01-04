package javaStudy.collection.list.ex;

import javaStudy.day1.test.A;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(10);
    list1.add(20);
    //list1 에 저장된 모든 객체 출력
    for (Integer i : list1
    ) {
      System.out.println(i);
    }
    for (int i = 0; i < list1.size(); i++) {
      System.out.println(list1.get(i));
    }

    //list1의 인덱스 2번의 값을 20 -> 100 으로 변경 / 변경된 값 확인 절차 필요
    list1.set(1, 100);
    System.out.println(list1.get(1));

    //list1의 인덱스 1번의 객체 삭제
    list1.remove(1);
    try {
      System.out.println(list1.get(1));
    } catch (IndexOutOfBoundsException e) {
      System.out.println(e.getMessage());
    }
    System.out.println(list1.size());

    // 정수형 타입으로 2행 5열 배열 생성하고 1,2,3,4,5     6,7,8,9,10 초기화 할당하세요
//    Integer[][] idata = new Integer[2][5];
//    Integer idata[2][5] =
    Integer idata[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}}; // 자동생성

    System.out.println(idata[0][4]);

    Integer[][][] data = {
            {
                    {1, 2, 3},
                    {4, 5, 6}
            },
            {
                    {7, 8, 9},
                    {10, 11, 12}
            }

    };
    System.out.println(data[1][1][1]);

    Integer count = 0;
//    for(Integer item=0; item<dataset.length; item++){
//      if(dataset[item].indexOf("i")>=0){
//        count++;
//      }
//    }
  }
}
