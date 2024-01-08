package javaStudy.collection.app;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain2{
  public static void main(String[] args) {
    Student student2[] = new Student[5];
    //순서대로 "이름", 학번, 학점
    student2[0] = new Student("Dave", 20240001, 4.2);
    student2[1] = new Student("Amie", 20160001, 4.5);
    student2[2] = new Student("Emma", 20110001, 3.5);
    student2[3] = new Student("Brad", 20130001, 2.8);
    student2[4] = new Student("Cara", 20140001, 4.2);

    Arrays.sort(student2);
    Arrays.stream(student2).forEach(System.out::println);

    Arrays.sort(student2, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        if(o1.score == o2.score){
          return Integer.compare(o1.id, o2.id);
        }
        return Double.compare(o2.score,o1.score);
      }
    });

    System.out.println();
    Arrays.stream(student2).limit(2).forEach(stu -> System.out.println(stu));

  }
}

