package quiz.appliance;

public class StandTypeAirConditioner extends AirConditioner implements RemoteControl{

  StandTypeAirConditioner(String airconType){
    super(airconType);
    this.name = "그냥 에어컨";
  }
  @Override
  public void mePrint() {
    System.out.println(airconType+"입니다.");
  }
  public void turnon() {
    System.out.println(this.name+" turn on");
  }
  public void turnoff() {
    System.out.println(this.name+" turn off");
  }
}
