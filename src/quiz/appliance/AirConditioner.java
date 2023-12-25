package quiz.appliance;

public abstract class AirConditioner extends Appliance{
  String airconType;
  Filter filter;
  DrainagePump drainagePump;

  public AirConditioner (String airconType, Filter filter, DrainagePump drainagePump){
    this.airconType = airconType;
    this.filter = filter;
    this.drainagePump = drainagePump;
  }
}
