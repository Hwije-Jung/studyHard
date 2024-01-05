package javaStudy.collection.app;

import java.util.*;

public class TreeMapEx {
  public static void main(String[] args) {
    TreeMap<String, Integer> scores = new TreeMap<>();
    // Integer 점수 저장

    scores.put("san",75);
    scores.put("tom",80);
    scores.put("sara",87);
    scores.put("sin",70);
    scores.put("adward",65);
    scores.put("kim",63);
    scores.put("kate",90);
    scores.put("billy",95);

    //점수를 foreach문을 이용해서 오름차순 정렬된 scores의 학생의 이름과 점수들을 출력

    Set<Map.Entry<String, Integer>> entrySet = scores.entrySet();
    Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

    while(entryIterator.hasNext()){
      Map.Entry<String, Integer> entry = entryIterator.next();
      System.out.println(entry.getKey()+" "+entry.getValue());
    }

    //특정 점수를 가져오기
    System.out.println(scores.floorEntry("san"));

    // 가장 낮은 점수 출력
    TreeSet<Integer> scoreSet = new TreeSet<>(scores.values());

    System.out.println("가장낮은점수: "+scoreSet.first());

    // 가장 높은 점수 출력
    System.out.println("가장높은점수: "+scoreSet.last());

    //90점 아래 점수
    System.out.println("90점 아래점수: "+scoreSet.headSet(90,false));

    //90점 위 점수
    System.out.println("90점 위 점수: "+scoreSet.tailSet(90,false));


    // 90점이거나 바로 아래 점수
    System.out.println("90 바로아래 점수"+scoreSet.lower(90));


    // 80점이거나 바로 위의 점수



    // 내림차순 정렬하기


    // 범위 검색(key: 이름이 b~k 학생의 이름과 점수 출력)
    while(entryIterator.hasNext()){
      Map.Entry<String, Integer> entry = entryIterator.next();
      System.out.println(entry.getKey()+" "+entry.getValue());
    }

    // 범위 검색(점수로 80<= scores <90 이름과 점수 출력)

  }

}

