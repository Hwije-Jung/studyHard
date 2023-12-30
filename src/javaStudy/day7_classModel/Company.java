package javaStudy.day7_classModel;

public class Company {
  public static void main(String[] args) {
    Gcompany gCar = new Gcompany(1234,"aaa");
    gCar.local_number();
    Hcompany hCar = new Hcompany(123,"afd");
    hCar.getNevigate();
    Scompany sCar = new Scompany(123,"sdf");
    sCar.getSpeed();
  }
}
