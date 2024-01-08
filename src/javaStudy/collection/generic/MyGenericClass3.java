package javaStudy.collection.generic;

import java.util.ArrayList;
import java.util.List;

public class MyGenericClass3 {
  public static  <T>int countOccurences(T[] array, T elment){
    int count = 0;

    for(T item : array){
      if(item.equals(elment)){
        count++;
      }
    }
    return count;
  }

//  public static void printList(List<?> list){
//    //모든 타입의 리스트를 받는다. 알수없는 요소가 넘어올 때
//    for(Object element: list){
//      System.out.println(element.toString());
//    }
//  }

//  public static Double listTotal(List<? extends Number> numbers){
//    double total = 0;
//    for(Number number: numbers){
//      total += number.doubleValue();
//    }
//    return total;
//  }
//  public static void addElements(List<? super Integer>list){
//    list.add(10);
//  }

  public static void printList(List<?> list){
    for (Object obj : list        ) {
      System.out.println(obj);
    }
  }

  public static void main(String[] args) {
    String[] strArray = {"apple","banana","apple","orange","apple"};
    String target = "apple";

    int occurrences = countOccurences(strArray,target);
    // static이라 바로 사용
    System.out.println(target + "문자열 객체가 "+ occurrences);
  }
}
