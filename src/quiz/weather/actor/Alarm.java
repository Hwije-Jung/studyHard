package quiz.weather.actor;

public class Alarm extends Actor{
  public Alarm(int humi){
    super(humi);

  }
  @Override
  void put(int type) {

  }

  @Override
  public void warning() {
    if(this.type >= 200){
      System.out.println("강수량 200 이상 경보 알림");
    }
    else {
      System.out.println("강수량 정상");
    }
  }

}
