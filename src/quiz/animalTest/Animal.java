package quiz.animalTest;

public abstract class Animal {
  protected int speed;
  protected double distance=0;

  Animal(int speed){
    this.speed = speed;
  }

  abstract void run(int hour);
  double getDistance(){
    return distance;
  }

}
