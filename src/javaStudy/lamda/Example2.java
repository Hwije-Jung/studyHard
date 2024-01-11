package javaStudy.lamda;

import java.util.Arrays;
import java.util.function.BiFunction;

@FunctionalInterface
interface Function<T>{
    public double apply(T t);
}
public class Example2 {
  private static Student[] students = {
          new Student("홍길동", 90, 96),
          new Student("신세계", 90, 95)
  };

public static double avg(Function <Student> function){

    double average = Arrays.stream(students).mapToDouble(function::apply)
            .average()
            .orElse(0.0);
//    double sum =0 ;
//    for(Student student : students){
//        sum+= function.apply(student);
//    }
//    return sum/students.length;
    return average;
}

    public static void main(String[] args) {

        double englishAvg = avg(s -> s.getEnglishScore());
        System.out.println("평균영어"+englishAvg);

        double mathAvg = avg(s->s.getMathScore());
        System.out.println("수학평균"+mathAvg);
    }
}


