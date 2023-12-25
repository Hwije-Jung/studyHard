package quiz.weather.actor;

public abstract class Actor {
  int type=0;

  Actor(int type){
    this.type = type;
  }

  abstract void put(int type); // body 가 없다.

  public abstract void warning();


}
