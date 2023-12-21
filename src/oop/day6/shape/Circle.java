package oop.day6.shape;

public class Circle extends Shape {

  private double radius;

  public Circle(String color, double radius) { // 생성자 맞춰줄 것
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return radius * radius * Math.PI;
  }

  @Override
  public String toString() {
    return "원 색상은" + super.getColor()+"그리고 면적은"+this.area();
  }

}
