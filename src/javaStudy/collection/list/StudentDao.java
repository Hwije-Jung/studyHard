package javaStudy.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
  List<Student> stuList = new ArrayList<>();
  Scanner sc = new Scanner(System.in);

  public void getStudentList() {
    //인터페이스 타입선언, arraylist, linkedList..등등 다 담을 수 있다.
    //5명이 글을 작성하였습니다. 5명이 쓴 글에대해 글 쓴 순서대로 boardList에 저장하세요
    stuList.add(new Student(1, "정휘제"));
    stuList.add(new Student(2, "이이이"));
    stuList.add(new Student(3, "박박박"));
    stuList.add(new Student(4, "휘휘휘"));

  }

  public void studentExamInsert() {
    for (Student st : stuList) {
      System.out.println(st.getName() + "의 국어, 영어, 수학 성적입력");
      for (int i = 0; i < 3; i++) {
        st.getArr()[i] = sc.nextInt();
      }
    }
  }

  public void studentRecordPrint() {
    int total=0;
    double avg;

    for (Student st : stuList) {
      for (int i = 0; i < 3; i++) {
        total =st.getArr()[i];
      }
      avg = total / 3.0;
      System.out.println(st.getName() + "의 총점: " + total + " 평균: " + avg);
    }
  }

  public void studentUpdate() {

    System.out.println("수정할 학생번호 입력");

    int stuid = sc.nextInt();

    for (Student st : stuList) {
      int[] arr= new int[3];
      if (st.getStuno()==stuid) {
        System.out.println(st.getName() + "의 국어, 영어, 수학 입력할 것");
        for (int i = 0; i < 3; i++) {
          arr[i]=sc.nextInt();
        }
        st.setArr(arr);
        System.out.println("변경 완료");
      }
    }
  }

  public void studentPrintAll() {
    for (Student st : stuList) {


      System.out.println("학번: " + st.getStuno() + " 이름: " + st.getName() + " 국어: " + st.getArr()[0] + " 영어: " + st.getArr()[1] + " 수학: " + st.getArr()[2]);
    }
  }

  public void studentPickPrint() {
    System.out.println("조회하고싶은 학생 번호 입력:");
    int stuid = sc.nextInt();


    for (Student st : stuList) {
      if (st.getStuno() == stuid) {
        System.out.println("학번: " + st.getStuno() + " 이름: " + st.getName() + " 국어: " + st.getArr()[0] + " 영어: " + st.getArr()[1] + " 수학: " + st.getArr()[2]);


      }
    }
  }

}
