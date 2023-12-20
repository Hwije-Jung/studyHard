package project2.project.vo;

public class Person {

  private String name;
  private String phone;

  private String address;

  Person (String name, String phone){
    this.name = name;
    this.phone = phone;
  }
  Person(String name, String phone, String address){
    this.name = name;
    this.phone = phone;
    this.address = address;
  }

  public String getName() {

    return name;
  }

  public String getPhone() {

    return phone;
  }

}