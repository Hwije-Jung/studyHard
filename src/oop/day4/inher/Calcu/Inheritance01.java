package oop.day4.inher.Calcu;

public class Inheritance01 extends Calculation {
  public void multiplication() {
    System.out.println("두 수의 곱셈 :"+super.a*super.b);
  }

  Inheritance01(int a, int b){
    super(a,b);
  }
}
