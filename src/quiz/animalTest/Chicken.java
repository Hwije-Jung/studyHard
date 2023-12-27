package quiz.animalTest;

public class Chicken extends Animal implements Cheatable{

  Chicken (int speed){

    super(speed);
  }

  @Override
  void run(int hour) {
    super.distance += hour*super.speed;
  }

  @Override
  public void fly() {
      super.speed *= 2;
  }
}
