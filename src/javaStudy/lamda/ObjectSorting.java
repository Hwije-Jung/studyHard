package javaStudy.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ObjectSorting {
  public static void main(String[] args) {
    List<Product1> products = Arrays.asList(new Product1("Laptop", 1500),
            new Product1("applePhone", 1212),
            new Product1("Tablet", 2342),
            new Product1("mouse", 654)
    );
    System.out.println("========Product 리스트=========");
    products.forEach(System.out::println);
    List<Product1> sortedProducts = products.stream()
            .sorted(Comparator.comparing(Product1::getPrice))
            .collect(Collectors.toList()); // toList();

    System.out.println("========가격별 정렬된 Product 리스트=========");
    sortedProducts.forEach(System.out::println);
  }
}
