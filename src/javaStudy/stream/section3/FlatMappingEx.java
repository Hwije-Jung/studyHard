package javaStudy.stream.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMappingEx {
  public static void main(String[] args) {
    List<String> list1 = new ArrayList<>();
    list1.add("this is java back end course.");
    list1.add("i am a best developer");
    list1.stream()
            .flatMap(data-> Arrays.stream(data.split(" ")))
            .forEach(System.out::println);
    System.out.println();
  }
}
