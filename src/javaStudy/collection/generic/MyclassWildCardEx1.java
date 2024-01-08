package javaStudy.collection.generic;

import javaStudy.collection.board.Board;

import java.util.ArrayList;
import java.util.List;

public class MyclassWildCardEx1 extends Board{
//  public static void printList(List<?> list){
//    list.forEach(System.out::println);
//  }
  public static <T extends Comparable<T> & Cloneable>void printList(List<?> list){
    list.forEach(System.out::println);
  }

  public String toString(){
    return "board";
  }
  public static void main(String[] args) {
    List<Integer> strList = new ArrayList<>(List.of(1,2,3,4,5,67,8,9,10));
    List<String> stringList1 = new ArrayList<>(List.of("lee","kim","jin"));
    printList(strList);
    printList(stringList1);

    List<Board> boardList = new ArrayList<>();
    boardList.add(new Board());
    boardList.add(new Board());
    printList(boardList);


  }
}
