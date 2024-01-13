//package javaStudy.stream;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.stream.IntStream;
//import java.util.stream.Stream;
//
//public class StreamPipeLineStudent {
//  public static void main(String[] args) {
//    Student stu1 = new Student("유재석",99);
//    Student stu2 = new Student("김재석",90);
//    Student stu3 = new Student("박재석",97);
//    Student stu4 = new Student("정재석",80);
//    List<Student> students = Arrays.asList(stu1,stu2,stu3,stu4);
//
//    // 방법1
//    Stream<Student> studentStream = students.stream();
//    IntStream scoreStream = studentStream.mapToInt(Student::getScore);
//    int sum = scoreStream.sum();
//    double averge = scoreStream.average().getAsDouble();
//
//    // 방법2 : 파이프라인
//    double average2 = students.stream()
//            .mapToInt(student -> student.getScore())
//            .average()
//            .getAsDouble(); // double로 반환
//
//    // 방법3
//    double average3 = students.stream()
//            .mapToDouble(student -> student.getScore()).average().orElse(0.0);
//
//    // 방법4
//    double average4 = students.stream()
//            .mapToDouble(Student::getScore).average().orElse(0.0);
//  }
//}
