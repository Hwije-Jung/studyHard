package oop.day4.inher;

import model.test.B;

public class CatMain {
  public static void main(String[] args) {
    BabyCat babyCat = new BabyCat("brown");
    babyCat.meow();
    babyCat.eat();
    babyCat.printInfo();
    Object obj1 = babyCat; // 최상위 객체로 됨
    BabyCat baby =(BabyCat) obj1; // 원형으로 역직렬화
    baby.printInfo(); // Object 타입일땐 못 불러와,
    // 다시 복원시켜야해, object타입은 그릇에 안전하게 보관만
  }
}
