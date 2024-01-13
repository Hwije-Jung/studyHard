package javaStudy.threadex;

public class User1Thread extends Thread{
  private CalculatorEx calculator;
  public User1Thread(){
    setName("User1Thread");
  }

  public void setCalculator(CalculatorEx calculator){
    this.calculator = calculator;
  }

  public void run(){
    calculator.setMemory1(100); // 동기화 메소드호출
  }
}
