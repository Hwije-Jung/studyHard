package javaStudy.day7_classModel;


public class Hcompany extends Car {

  private int price;
  Hcompany(int year, String name){
    super(year,name);
  }

  public void getNevigate(){
    System.out.println(price);
  }
}
