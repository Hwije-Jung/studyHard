package javaStudy.day4.inher.Calcu;

public class Calculation {

  public int a = 20;
  public int b = 10;

  public void addition(){
    System.out.println("두 수의 덧셈 :"+(a+b));
  }

  public void subtraction(){
    System.out.println("두 수의 뺄셈 :"+(a-b));
  }

  Calculation(int a, int b){
    this.a = a;
    this.b = b;
  }
}
