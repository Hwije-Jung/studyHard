package javaStudy.threadex;

public class User2Thread extends Thread{
  private CalculatorEx calculator;
  public User2Thread(){
    setName("User2Thread");
  }

  public void setCalculator(CalculatorEx calculator){
    this.calculator = calculator;
  }

  public void run(){
    calculator.setMemory2(50); // 동기화 메소드호출
  }
}
