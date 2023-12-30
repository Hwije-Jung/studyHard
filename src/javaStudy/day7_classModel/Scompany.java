package javaStudy.day7_classModel;

public class Scompany extends Car {

  private int cc;
  Scompany(int year, String name){
    super(year,name);
  }

  public void getSpeed(){
    System.out.println(cc);
  }
}
