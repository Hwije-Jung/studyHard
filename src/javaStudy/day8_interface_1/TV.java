package javaStudy.day8_interface_1;
// RemoteControler이라는 인터페이스를 기준으로 해당TV클래스를 구현하세요
// 삼성 TV객체를 생성하여 다음과 같은 동작을 차례로 수행시키세요
// 1. 전원을 켠다.
// 2. 해당 TV의 기본 MAX_, MIN_ 볼륨값을 확인한다.
// 3. TV의 볼륨을 20으로 세팅하고 값을 확인한다.
// 4. 전원을 끈다.

public class TV implements RemoteControler {

  private int volume;
  private int memory;


  @Override
  public void turnOn() {
    System.out.println("전원 킴");
  }

  @Override
  public void turnOff() {
    System.out.println("전원 끔");
  }

  @Override
  public void setVolume(int volume) { // 추상메소드 재정의(오버라이딩)
    //인터페이스 상수 MAX_VOLUME 과 LOW_VOLUME사용하여
    if(volume >RemoteControler.MAX_VOLUME){
      this.volume = RemoteControler.MAX_VOLUME;
    }
    else if(volume < RemoteControler.MIN_VOLUME){
      this.volume = RemoteControler.MIN_VOLUME;
    }
    else {
      this.volume = volume;

    }
    System.out.println("현재 볼륨: "+this.volume);
  }

  @Override
  public int getVolume() {
    return 0;
  }

  public void setMute(boolean mute){

    if(mute){
      this.memory = this.volume;
      System.out.println("mute Processing ");
      setVolume(MIN_VOLUME);
    }
    else {
      System.out.println("Mute Cancel");
      this.volume = this.memory;
    }
  }

  public void verifyVol(){
    System.out.println("max 볼륨: "+MAX_VOLUME);
    System.out.println("min 볼륨: "+MIN_VOLUME);
  }
}
