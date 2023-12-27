package oop.day8_interface_1;

public class Radio implements RemoteControler{
  private int volume;
  @Override
  public void turnOn() {
    System.out.println("전원킴");
  }

  @Override
  public void turnOff() {
    System.out.println("전원끔");
  }

  @Override
  public void setVolume(int volume) {
this.volume = volume;
  }

  @Override
  public int getVolume() {
    return 0;
  }
}
