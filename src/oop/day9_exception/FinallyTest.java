package oop.day9_exception;

import java.util.Scanner;

public class FinallyTest {
  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    int num1, num2;
    num1 = sc.nextInt();
    num2 = sc.nextInt();
//    try {
//      returnintFinally();
//      break;
//    }
    FinallyTest test = new FinallyTest();
//    int checkn = FinallyTest.
  }

  static int returnintFinally(int num1, int num2) throws ArithmeticException {

    try {
      double result = num1 / num2;
      String data = String.format("%.2f", result);
      System.out.println(data);
      return 0;
    } catch (ArithmeticException ar) {
      ar.getMessage();
      System.out.println("ArithmeticException catch구문 출력");
      return 2;
    } catch (Exception e) {
      e.getMessage();
      System.out.println("catch 구문 출력");
      return 3;
    } finally {
      System.out.println("finally 구문 출력");
      return 1;
    }



  }

}
