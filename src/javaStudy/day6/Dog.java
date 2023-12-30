package javaStudy.day6;

public class Dog extends AbstractDog{
  @Override
  public void printSound() { // 반드시해줘야한다
    System.out.println("멍멍");
  }

  public void tailing(){
    System.out.println("살랑살랑");
  }
}
