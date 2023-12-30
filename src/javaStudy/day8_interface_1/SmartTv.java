package javaStudy.day8_interface_1;

public class SmartTv implements RemoteControler, Searchable {
  // 리모컨 + 찾기기능
  private int volume;
  private int channel;

  @Override
  public void turnOn() {
    System.out.println("smart TV 전원 on");
  }

  @Override
  public void turnOff() {
    System.out.println("smart TV 전원 off");
  }

  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControler.MAX_VOLUME) {
      this.volume = RemoteControler.MAX_VOLUME;
    } else if (volume < RemoteControler.MIN_VOLUME) {
      this.volume = RemoteControler.MIN_VOLUME;
    } else {
      this.volume = volume;

    }
    System.out.println("현재 볼륨: " + this.volume);
  }

  @Override
  public int getVolume() {
    return 0;
  }

  @Override
  public void setMute(boolean mute) {
    RemoteControler.super.setMute(mute);
  }

  @Override
  public void search(String url) {
    System.out.println(url + "검색합니다.");
  }

  @Override
  public void channelUp(int channel) {
    this.channel++;
  }

  @Override
  public void channelDown(int channel) {
    this.channel--;
  }
}
