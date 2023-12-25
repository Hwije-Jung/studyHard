package quiz.weather.actor;

public class Broker {
  int n;
  Actor[] aa = new Actor[3];

  public Broker(int humi, int rain, int themo){
    aa[0] = new Alarm(rain);
    aa[1] = new Dehumid(humi);
    aa[2] = new Aircon(themo);
  }
  void add (int n){

  }

  public void operatingState(){
    aa[0].warning();
    aa[1].warning();
    aa[2].warning();
  }

  public void cast (){
    System.out.println("기계 작동");
  }
}
