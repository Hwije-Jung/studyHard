package quiz.appliance;

public class WallMountedAirConditioner extends AirConditioner implements RemoteControl{


  public WallMountedAirConditioner(String airconType){
    super(airconType);
    this.name = "벽 에어컨";
  }
  @Override
  public void mePrint() {
    System.out.println(airconType+"입니다.");
  }

  @Override
  public void turnon() {
    System.out.println(this.name+" turn on");
  }

  @Override
  public void turnoff() {
    System.out.println(this.name+" turn off");

  }
}
