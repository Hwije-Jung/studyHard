package javaStudy.stream.section3;
// 학생별 국에점수 학생별 영어점수 학생별 수학점수 학생이름 오름차순 정렬, 내림차순 정렬

// 총점 평균 ....평균을 기준으로 오름차순 정렬

import javaStudy.stream.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingComparable {
  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("김나나",90));
    studentList.add(new Student("신지수",90));

    //점수를 기준으로 오름차순 정렬한새 스트림을 얻어오기
    //sorted()를 쓸 수 있는 이유: Student에 implement해줬기 때문
    studentList.stream().sorted().forEach(student -> System.out.println(student.getName()+":"+student.getScore()));

    //점수를 기준으로 내림차순 정렬한 새 스트림 얻어오기
    studentList.stream().sorted(Comparator.reverseOrder()).forEach(student-> System.out.println(student.getName()+":"+student.getScore()));

    //만약 Comparable 인터페이스가 구현되지 않은 구현체를 정렬하려면 Comparator를 이용한다.
    List<Student1> studentList2 = new ArrayList<>();
    studentList2.add(new Student1("김이이",90));
    studentList2.add(new Student1("신지송",90));

    //점수를 기준으로 오름차순으로 정렬한 새 스트림 생성
    // score기준 오름차순 하겠다.
    studentList2.stream()
            .sorted((s1,s2)->Integer.compare(s1.getScore(),s2.getScore()))
            .forEach(student1 -> System.out.println(student1.getName()+" "+student1.getScore()));

    //점수를 기준으로 내림차순으로 정렬한 새 스트림 얻기
    //s1, s2 순서바꾸기
    studentList2.stream()
            .sorted((s1,s2)->Integer.compare(s2.getScore(),s1.getScore()))
            .forEach(student1 -> System.out.println(student1.getName()+" "+student1.getScore()));


  }
}
