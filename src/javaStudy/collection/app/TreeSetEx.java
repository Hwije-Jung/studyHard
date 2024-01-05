package javaStudy.collection.app;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
  public static void main(String[] args) {
    TreeSet<Integer> scores = new TreeSet<>();
    // Integer 점수 저장

    scores.add(75);
    scores.add(80);
    scores.add(87);
    scores.add(70);
    scores.add(65);
    scores.add(63);
    scores.add(90);
    scores.add(95);

    Iterator<Integer> iterator;
    //점수를 foreach문을 이용해서 전체 점수 출력
    iterator = scores.iterator();
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

    scores.forEach(System.out::println);

    //특정 점수를 가져오기
    System.out.println(scores.floor(87));

    // 가장 낮은 점수 출력
    System.out.println(scores.first());

    // 가장 높은 점수 출력
    System.out.println(scores.last());

    //90점 아래 점수
    System.out.println(scores.headSet(scores.floor(90),false));
    System.out.println(scores.headSet(90, false));

    //90점 위 점수
    System.out.println(scores.tailSet(scores.floor(90),false));
    System.out.println(scores.tailSet(90, false));

    // 90점이거나 바로 아래 점수
    System.out.println(scores.lower(90));

    // 80점이거나 바로 위의 점수
    System.out.println(scores.higher(90));

    // 내림차순 정렬하기
    iterator = scores.descendingIterator();
    while(iterator.hasNext()){
      System.out.print(iterator.next());
    }
    NavigableSet<Integer> descendingScores = scores.descendingSet();
    for(Integer s : descendingScores){
      System.out.println(s + " ");
    }

    System.out.println(scores.descendingSet());

    // 범위 검색(80<=)
    System.out.println(scores.tailSet(scores.floor(80),true));
    System.out.println(scores.tailSet(80, true));

    // 범위 검색(80<= scores < 90)
    System.out.println(scores.subSet(scores.floor(80),true,scores.floor(90),false));
    System.out.println(scores.subSet(80,true,scores.floor(90),false));
  }

}
