package oop.day6.interfaceModel;

public class Audio implements RemoteControl{
  @Override
  public void turnOn() {
    System.out.println("Audio on");
  }

  @Override
  public void turnOff() {
    System.out.println("Audio off");
  }
}
