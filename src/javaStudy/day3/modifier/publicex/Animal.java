package javaStudy.day3.modifier.publicex;

public class Animal {
  protected String name;

  String color;
  protected String getName(){
    return name;
  }

  private String point;

  void getColor(){
    System.out.println(this.color);
  }
}
