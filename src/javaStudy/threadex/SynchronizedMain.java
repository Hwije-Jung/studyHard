package javaStudy.threadex;

import javaStudy.day1.test.C;

public class SynchronizedMain {

  public static void main(String[] args) {

    CalculatorEx calculator = new CalculatorEx();

    User1Thread user1 = new User1Thread();
    user1.setCalculator(calculator);
    user1.start();

    User2Thread user2 = new User2Thread();
    user2.setCalculator(calculator);
    user2.start();


  }
}
