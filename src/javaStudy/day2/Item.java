package javaStudy.day2;

public interface Item {
    //인터페이스라는 타입은 기능정의(메소드 정의)만 한다. ---> abstract method(추상메소드)
    public String name();
    public Packing packing();
    public float price();
}
