package oop.day8_interface_1.interface_4;

public class Bus implements Vehicle {
  @Override
  public void run() {
    System.out.println("버스");
  }

  public void checkFare() {
    System.out.println("버스승차요금확인");
  }
}
