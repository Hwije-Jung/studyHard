package quiz.animalTest;

public class Dog extends Animal{

  Dog(int speed){
    super(speed);
  }

  @Override
  void run(int hour) {
    super.distance += (hour/2.0)*super.speed;
  }
}
