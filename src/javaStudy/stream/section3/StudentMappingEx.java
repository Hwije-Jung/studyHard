//package javaStudy.stream.section3;
//
//import javaStudy.day1.test.A;
//import javaStudy.stream.Student;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class StudentMappingEx {
//  public static void main(String[] args) {
//    //1. Student 클래스 타입의 stulist 리스트 컬렉션을 생성하세요
//    List<Student> stulist = new ArrayList<>();
//
//    //2. Scanner 클래스로 학생의 이름과 성적을 입력받아 5명의 학생 객체를 stulist에 저장하세요
//    //    Scanner sc = new Scanner(System.in);
//    //    for (int i = 0; i < 5; i++) {
//    //      String name = sc.nextLine();
//    //      int kor = Integer.parseInt(sc.next());
//    //      int eng = Integer.parseInt(sc.next());
//    //      int mat = Integer.parseInt(sc.next());
//    //      stulist.add(new Student(name, kor, eng, mat));
//    //    }
//
//    stulist.add(new Student("정휘제1",12,23,23));
//    stulist.add(new Student("정휘제2",32,45,76));
//    stulist.add(new Student("정휘제3",67,45,65));
//    stulist.add(new Student("정휘제4",13,24,23));
//    stulist.add(new Student("정휘제5",43,23,78));
//
//    //3. 학생별 이름만 저장한 namelist를 만들고 출력하세요
//    Stream<String> nameList = stulist.stream().map(Student::getName);
//    nameList.forEach(System.out::println);
//
//    //4. 학생별 국어점수를 저장한 korScoreList 만들고 출력하세요
//    List<Integer> korScoreList = stulist.stream().map(Student::getKorscore).collect(Collectors.toList());
//    korScoreList.forEach(System.out::println);
//
//    //5. 국어점수의 총합과 평균을 구하여 출력하세요
//    System.out.println(stulist.stream().map(Student::getKorscore).mapToInt(Integer::intValue).sum());
//    System.out.println(stulist.stream().map(Student::getKorscore).mapToDouble(Double::valueOf).average().orElse(0.0));
//
//    //6. 학생별 영어점수를 저장한 engScoreList 만들고 출력하세요
//    List<Integer> engScoreList = stulist.stream().map(Student::getKorscore).collect(Collectors.toList());
//    engScoreList.forEach(System.out::println);
//
//    //7. 영어 점수의 총합과 평균을 구하여 출력하세요
//    System.out.println(stulist.stream().map(Student::getEngscore).mapToInt(Integer::intValue).sum());
//    System.out.println(stulist.stream().map(Student::getEngscore).mapToDouble(Double::valueOf).average().orElse(0.0));
//
//    //8. 학생별 수학저수를 저장한 mathScoreList 만들고 출력하세요
//    List<Integer> mathScoreList = stulist.stream().map(Student::getKorscore).collect(Collectors.toList());
//    mathScoreList.forEach(System.out::println);
//
//    //9. 수학점수의 총합과 평균을 구하여 출력하세요
//    System.out.println(stulist.stream().map(Student::getMathscore).mapToInt(Integer::intValue).sum());
//    System.out.println(stulist.stream().map(Student::getMathscore).mapToDouble(Double::valueOf).average().orElse(0.0));
//
//    //10. 학생별 총합 점수와 평균을 구하여 totalExam에 저장하여 성적표를 출력하세요
//    //totalExam 리스트
//    System.out.println("번호 이름 국어 영어 수학 총점 평균");
//    List<String> totalExam = stulist.stream().map(st -> (stulist.indexOf(st)+1) + "   " + st.getName() + "  " + st.getKorscore() + "  " + st.getEngscore() + "  " + st.getMathscore()
//                    + "  " + (st.getKorscore() + st.getEngscore() + st.getMathscore()) + "  " + ((double)(st.getKorscore() + st.getEngscore() + st.getMathscore())/3))
//            .collect(Collectors.toList());
//
//    totalExam.stream().forEach(System.out::println);
//
//  }
//}
//
//
