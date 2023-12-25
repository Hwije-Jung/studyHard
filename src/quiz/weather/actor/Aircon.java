package quiz.weather.actor;

public class Aircon extends Actor{

  Aircon(int themo){
    super(themo);
  }
  @Override
  void put(int type) {
    super.type = type;
  }

  @Override
  public void warning() {
    if(type>=30){
      System.out.println("온도 30이상으로 에어컨 작동");
    }
    else if(type<=20){
      System.out.println("온도 20 이하로 에어컨 정지");
    }
    else {
      System.out.println("온도 30미만 에어컨 변화 없음");
    }
  }
}
