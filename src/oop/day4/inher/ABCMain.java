package oop.day4.inher;

class A {
  private int numberA;

  A() {
  }
  public int getNumberA() {
    return numberA;
  }

  public void printNumberA() {
    System.out.println(getNumberA());
    ;
  }
}

class B extends A {
  private int numberB;
  int b = 1;

  B() {
    super();
    printNumberB();
  }

  public int getNumberB() {
    return numberB;
  }

  public void printNumberB() {
    System.out.println(getNumberB());
  }

  public void B (){
    System.out.println("B나는B");
  }
}

class C extends B {
  private int numberC;
  int c = 2;

  public int getNumberC() {
    return numberC;
  }

  public void printNumberC() {
    System.out.println(getNumberC());
  }

  public void B (){
    System.out.println("나는C");
  }
}

class D extends C {
  private int numberD;

  public int getNumberD() {
    return numberD;
  }

  public void getAllInfo() {
    super.printNumberA();
    super.printNumberB();
    super.printNumberC();
    System.out.println(getNumberD());
  }
}

public class ABCMain {
  public static void main(String[] args) {
    B b = new B();
    b.getNumberB();
    b.getNumberA();
    b.printNumberB();
    b.printNumberA();


    A a = new B();
    a.getNumberA();
    a.printNumberA();

    D d = new D();
    d.getAllInfo();
    B c = new C();
//    c.getNumberC();


  }
}
