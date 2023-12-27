package oop.day8_interface_1.interface_3;

public class Interfase3Main {
  public static void main(String[] args) {

    B b = new B();
    C c = new C();
    System.out.println("=========================");
    D d = new D();
    E e = new E();
    System.out.println("=========================");


    System.out.println("=========================");

    A a;
  //변수에 구현 객체 대입
    a = b; // A <== B 자동타입변환(promotion)
    B b1 = (B)a; // A ===> B 캐스팅(casting)
    a = c; // A <== C 자동타입변환
    C c1 = (C)a;
    a = d;
    D d1 = (D)a;
    a = e; // A <=== E 자동타입변환
    E e1 = (E) a;
    //




  }
}
