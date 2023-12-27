package oop.day8_interface_1;

public class MultiInterfaceMain {
  public static void main(String[] args) {
    RemoteControler remoteControler;
    Searchable searchable;


    remoteControler = new SmartTv();
    remoteControler.turnOff();;
    remoteControler.setVolume(20);
    remoteControler.setMute(true);

    searchable = new SmartTv();
    searchable.search("hhtps://naver.com");
  }
}
