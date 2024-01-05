package javaStudy.collection.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Map.of() key,value 최대 10개까지 넣을 수 있는 메소드
public class MapofEx {
  public static void main(String[] args) {
    Map<Integer,String> map = Map.of(1,"first",2,"second");
    //immutable
    map.forEach((k,v) -> System.out.println(k + " - " + v));
    // map.put(3,"three"); // 에러

    //List Map
    List<String> list1 = new ArrayList<>();
    list1.add("first");
    list1.add("second");
    list1.add("third");
    List<String> list2 = new ArrayList<>();
    list2.add("1");
    list2.add("2");
    list2.add("3");
    Map<Integer, List<String>> map2 = Map.of(1,list1,2,list2);
    System.out.println(map2);
    list1.add("five");
    System.out.println(map2);
    map2.forEach((k,v) -> System.out.println(k + " - " + v));
  }
}
