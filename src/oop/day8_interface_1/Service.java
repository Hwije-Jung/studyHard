package oop.day8_interface_1;

public interface Service {
  //default 메소드

  default void defaultMethod1() {
    System.out.println("defalutMethod1()의 코드");
    defaultCommon(); // 부를수있다.
  }

  default void defaultMethod2() {
    System.out.println("defalutMethod2()의 코드");
    defaultCommon();
  }


  //private 메소드
  private void defaultCommon() {
    System.out.println("defaultMethod의 중복코드 1");
    System.out.println("defaultMethod의 중복코드 2");
  }


  //정적 메소드
  static void staticMethod1() {
    System.out.println("staticMethod1의 종속코드 1");
    staticCommon(); // static 은 static 끼리
  }

  static void staticMethod2() {
    System.out.println("staticMethod1의 종속코드 2");
    staticCommon();
  }

  //private  static 메소드
  private static void staticCommon() {
    System.out.println("staticMethod 중복 코드 3");
    System.out.println("staticMethod 중복 코드 4");

    //재사용할 수있다.
  }
}
