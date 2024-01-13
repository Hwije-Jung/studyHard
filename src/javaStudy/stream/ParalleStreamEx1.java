//package javaStudy.stream;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.Stream;
//
//public class ParalleStreamEx1 {
//
//  //List컬렉션의 내부 반복자를 이용해서 병렬처리를 하는 방법
//  //parallelStream() : 병렬 처리 스트림
//  public static void main(String[] args) {
//    List<String> names = Arrays.asList("김진성","강호동","유재석","신동엽","서장훈");
//
//    Stream<String> parallelStream = names.parallelStream(); //병렬스트림 얻기
//    parallelStream.forEach(name -> {
//      System.out.println(name + " : "+ Thread.currentThread().getName());
//    });
//
//    Student st1 = new Student("a",1);
//    Student st2 = new Student("b",10);
//    Student st3 = new Student("c",12);
//    List<Student> students = Arrays.asList(st1,st2,st3);
//
//    //합구하기
//    System.out.println(students.stream().mapToInt(Student::getScore).sum());
//
//    //평균구하기
//    System.out.println(students.stream().mapToDouble(Student::getScore).average().orElse(0.0));
//
//    //카운트구하기
//    System.out.println(students.stream().count());
//
//  }
//}
