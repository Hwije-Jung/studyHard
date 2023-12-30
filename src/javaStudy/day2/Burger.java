package javaStudy.day2;

public abstract class Burger implements Item{ // 추상클래스
    public Packing packing(){
        return new Wrapper();
    }
    public abstract float price();



}
