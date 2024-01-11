package javaStudy.lamda;

import java.util.Arrays;

@FunctionalInterface
interface Function1<T>{
  public double apply(T t);
}
public class Solution6 {
  private static Student[] students ={
          new Student("홍길동",90,96),new Student("신세계",90,95)
  };
  public static double avg(Function1<Student> function1){
    double average = Arrays.stream(students).mapToDouble(function1::apply).average().orElse(0.0);
    return average;
  }
  public static void main(String[] args) {
    double englishAvg1 = avg(Student::getEnglishScore);
    double englishAvg2 = avg(Student::getEnglishScore);

  }
}
