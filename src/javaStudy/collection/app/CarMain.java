package javaStudy.collection.app;

import java.util.Arrays;

public class CarMain {
  public static void main(String[] args) {
    Car[] cars = new Car[3];
    cars[0] = new Car("GENESIS", 3000);
    cars[1] = new Car("SONATA", 1500);
    cars[2] = new Car("Spark", 1800);

    Arrays.sort(cars); // 인덱스도 바뀜
    for (Car car : cars) { // 가격대로
      System.out.println(car.getCar());
    }
  }
}
