package javaStudy.collection.app;

import java.util.Arrays;
import java.util.Comparator;

public class StudentMain {
  public static void main(String[] args) {
    Student student[] = new Student[5];
    //순서대로 "이름", 학번, 학점
    student[0] = new Student("Dave", 20240001, 4.2);
    student[1] = new Student("Amie", 20160001, 4.5);
    student[2] = new Student("Emma", 20110001, 3.5);
    student[3] = new Student("Brad", 20130001, 2.8);
    student[4] = new Student("Cara", 20140001, 4.2);

    //과제 1
    Arrays.sort(student);

    for(Student s : student){
      System.out.println(s);
    }

    //과제 2
//    Arrays.sort(student,new Comparator<Student>(){
//      @Override
//      public int compare(Student o1, Student o2) {
//        if(o1.score == o2.score){
//          return Integer.compare(o1.id,o2.id);
//        }
//
//        return Double.compare(o2.score,o1.score);
//      }
//
//    });

    Arrays.sort(student, new Comparator<Student>() {
      @Override
      public int compare(Student o1, Student o2) {
        return Comparator.comparingDouble((Student stuTmp) -> stuTmp.score)
                .thenComparingInt(stuTmp -> - stuTmp.id).compare(o2,o1);
        // 성적은 내림차순, 학번은 오름차순이기 때문에 반대로 가져오기 위해서 하나를 - 붙여준다

        //return Comparator.comparingDouble((Student stuTmp) -> stuTmp.score).reversed()
        //        .thenComparingInt(stuTmp -> - stuTmp.id).compare(o2,o1);
        //reversed() 로 반대 방향 출력도 가능
      }});



    System.out.println();
    for(Student s : student){
      System.out.println(s);
    }

    //상위 2명
    System.out.println("\n=========================================");
    System.out.println("1등: "+student[0]);
    System.out.println("2등: "+student[1]);

  }
}
