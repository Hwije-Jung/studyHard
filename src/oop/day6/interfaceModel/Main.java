package oop.day6.interfaceModel;

public class Main {
  public static void main(String[] args) {

    RemoteControl rc1;
    RemoteControl rc2;
    rc1 = new Television(); //interface rc에 객체생성
    rc1.turnOn();
    rc1.turnOff();

    rc1 = new Audio(); // 같은 변수에 오디오 객체생성
    rc1.turnOn();
    rc1.turnOff();
  }
}
