package javaStudy.collection.app;

public class Car implements Comparable<Car>{
  // 정렬하고싶으면 implements
  private String car;
  private int price;

  public Car(String car, int price) {
    this.car = car;
    this.price = price;
  }

  public String getCar() {
    return car;
  }

  public void setCar(String car) {
    this.car = car;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Car o) { // 메소드오버라이딩
    int comparePrice = o.getPrice();
    return comparePrice - this.price;  // price기준 내림차순
 //   return this.price - comparePrice; // price 오름차순
  }
}
