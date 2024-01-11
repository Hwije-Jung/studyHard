package javaStudy.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

interface MathOperation1 {
  int twoSum1(int x, int y);
}

interface Length {
  int getLength(String str);
}

interface Calculator{
  int getSum(int a, int b);
}


public class Lamda___test {
  public static void main(String[] args) {
    //1
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
    int even = list.stream().filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
    System.out.println(even);

    //2
    BiFunction<Integer, Integer, Integer> twoSum = (x, y) -> x + y;
    System.out.println(twoSum.apply(1, 2));

    BiFunction<Integer,Integer,Integer> pplus = (w,e) -> w+e;


    //3
    Function<String, Integer> leng = (str) -> str.length();
    int len = leng.apply("aaa");
    System.out.println(len);

    Length length = (str) -> str.length();
    System.out.println(length.getLength("aaa"));

    //4,5
    Function<List<Integer>, Integer> evenSum1 = (arr) -> list.stream()
            .filter(a -> a % 2 == 0).mapToInt(Integer::intValue).sum();
    System.out.println(evenSum1.apply(list));

    //6
    Function<List<Integer>,Integer> xxF = (list1) -> list.stream().reduce(1,(x,y)->x+y);
    System.out.println(xxF.apply(list));

    //7
    Function<List<Integer>,Double> averageFun = (list2)->list.stream()
            .mapToDouble(Double::valueOf).average().orElse(0.0);
    System.out.println(averageFun.apply(list));

    //8
    MathOperation1 plus = (x,y) -> x+y;
    System.out.println(plus.twoSum1(1,2));

    //9
    Calculator calculator = (a,b)->a+b;
    System.out.println( calculator.getSum(1,2));

    //10
    Function<List<Integer>,Integer> evenSum = (list3)->list3.stream()
            .filter(a->a%2==0).reduce(0,(x,y)->x+y);
    System.out.println(evenSum.apply(list));
    Function<String,Integer> lambda = (str)->str.length();

    //2-1
    //4

    //2-2
    //4

    //2-3
    //2

    //2-4
    BiFunction<Double,Double,Double> cal = (x,y)-> x/y;
    System.out.println(cal.apply(10.0,4.0));

    //2-6
    //englishAvg = avg(Student::getEnglishScore);

    //2-7
    //mathAvg = avg(Student::getMathScore);
  }
}
