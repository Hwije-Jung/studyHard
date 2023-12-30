package javaStudy.day6;

public class Example01 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.printSound();
    Cat cat = new Cat();
    cat.printSound();
    Animal dog2 = new Dog();
    dog2.printSound();
    Animal d = new Dog(); // 외부에서는 얘가 dog인지 모름
    Animal c = new Cat(); // 데이터 추상화
    //인터페이스로 제어를 추상화하는방법
  }
}
