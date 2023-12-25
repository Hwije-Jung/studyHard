package quiz.weather.actor;

public class Dehumid extends Actor {
  public Dehumid(int humi) {
    super(humi);
  }

  @Override
  void put(int type) {

    super.type = type;
  }

  @Override
  public void warning() {
    if(type >= 70){
      System.out.println("습기 70% 이상으로 제습기 작동");
    }
    else if(type <= 30){
      System.out.println("습기 30% 이하로 제습기 정지");
    }
    else {
      System.out.println("습기 70%미만 제습기 변화 없음");
    }
  }


}
