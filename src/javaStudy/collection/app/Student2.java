package javaStudy.collection.app;

import java.util.Comparator;

public class Student2 implements Comparable<Student2>{
  String name; //이름
  int id; //학번
  double score; //학점
  public Student2(String name, int id, double score){
    this.name = name;
    this.id = id;
    this.score = score;
  }
  public String toString(){ //출력용 toString오버라이드
    return "이름: "+name+", 학번: "+id+", 학점: "+score;
  }

  @Override
  public int compareTo(Student2 o) {
//    return this.id - o.id; // 오름차순
    return COMPARATOR.compare(this,o);
  }

  public static final Comparator<Student2> COMPARATOR =
          Comparator.comparingInt((Student2 stu)->stu.id);
}