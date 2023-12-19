package oop.day3;

public class Student {
  private String id;
  private String name;
  public void insertRecord(String id,String name){
    this.id = id;
    this.name = name;
  }
  public void printInfo(){
    System.out.println(id+" "+name);
  }
}
