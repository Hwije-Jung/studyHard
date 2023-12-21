package oop.day6.vehicle;

public class Main {
  public static void main(String[] args) {
    Bike bike = new Bike();
    Car car = new Car();
    bike.printBrand();
    bike.printPrice();
    bike.printType();
    car.printType();
    car.printBrand();
    car.printPrice();
  }
}
