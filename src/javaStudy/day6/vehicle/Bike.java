package javaStudy.day6.vehicle;

public class Bike extends TwoWheeler{

  @Override
  public void printType() {
    System.out.println("이것은 자전거입니다.");
  }

  @Override
  public void printPrice() {
    System.out.println("가격 : 150,000");
  }

  public void printBrand(){
    System.out.println("삼천리 자전거");
  }
}
