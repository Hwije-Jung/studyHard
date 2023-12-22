package oop.day7_classModel;

public class Gcompany extends Car{

  private int number;

  Gcompany(int year, String name){
    super(year,name);
  }

  public void local_number(){
    System.out.println(this.number);
  }

}
