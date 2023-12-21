package oop.day6.shape;

public abstract class Shape {
  private String color;
  public abstract double area();
  public abstract String toString();

  public Shape(String color){
    System.out.println("Shape 클래스 생성자 호출");
    this.color = color;
  }

  public String getColor(){
    return this.color;
  }

}
