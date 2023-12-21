package oop.day6.shape;

public class Rectangle extends Shape{
  int length;
  int width;

  Rectangle(String color, int length, int width){
    super(color);
    this.length=length;
    this.width=width;
  }

  @Override
  public double area() {
    return length*width;
  }

  @Override
  public String toString() {
    return "사각형 색상은 "+super.getColor()+"그리고 면적은 :"+this.area();
  }
}
