package javaStudy.day8_interface_1;

public interface RemoteControler {
  //1. 상수필드
  int MAX_VOLUME = 30;
  //상수: public static final 굳이 이래 안해도됨 자동으로 이렇게 컴파일 과정에서 붙음
  public static final int MIN_VOLUME = 0;
  // 상수는 대문자로하는게 원칙
  // 언더바 사용하셈

  //2.추상메소드 abstract, {} 바디가 없는 메소드(메소드 선언부만 작성)
  public void turnOn(); // 전원 켬
  public void turnOff(); // 전원 끔
  void setVolume(int volume); // 볼륨 세팅
  //디폴트 인스턴스 메소드(default method) 인터페이스에서 완전한 실행코드를 가진 유일한 메소드

  int getVolume();
  default void setMute(boolean mute){

    if(mute){
      System.out.println("mute Processing ");
      setVolume(MIN_VOLUME);
    }
    else {
      System.out.println("Mute Cancel");
    }
  }

  static void changeBattery(){
    System.out.println("리모컨 건전지를 교환해야 합니다.");
  }


}