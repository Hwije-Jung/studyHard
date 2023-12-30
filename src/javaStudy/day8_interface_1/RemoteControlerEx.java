package javaStudy.day8_interface_1;


public class RemoteControlerEx {
  public static void main(String[] args) {
    // 1.상수는 구현객체와 상관없는 인터페이스 멤버이므로 바로 접근해서 상수값을 읽을 수 있다.
    System.out.println(RemoteControler.MAX_VOLUME);
    System.out.println(RemoteControler.MIN_VOLUME);
    System.out.println(Math.PI);

    RemoteControler remoteControler;

    remoteControler = new TV();

    remoteControler.turnOn(); // TV에대한 구현메소드 실행
    remoteControler.turnOff(); // TV

//    TV samTv = new TV();
//    RemoteControler SS = new TV();
//    samTv.turnOn();
//    samTv.verifyVol();
//    samTv.setVolume(10);
//    samTv.turnOff();

    Radio lgRadio = new Radio();
    lgRadio.turnOn();
    lgRadio.setVolume(20);
    lgRadio.turnOff();

    //3. default method : setMute()사용
    remoteControler.setMute(true);
    remoteControler.setMute(false);
    //무음처리 기능을 TV클래스에서 기존의 볼륨을 기억하여 복원시키는 기능으로 재정의

    RemoteControler.changeBattery(); // 직접호출


  }
}
