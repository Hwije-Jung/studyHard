package oop.day6.shape;

import model.test.C;

public class ExampleMain {
  public static void main(String[] args) {
    Circle circle = new Circle("red", 3.5);
    System.out.println(circle.toString());
    Rectangle rectangle = new Rectangle("노란색",2,4);
    System.out.println(rectangle.toString());

  }
}
