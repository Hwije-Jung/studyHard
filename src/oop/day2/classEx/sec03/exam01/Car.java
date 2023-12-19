package oop.day2.classEx.sec03.exam01;

public class Car {
	//필드 선언 자동차는 모델과 엔진을 시자가고 중지할 수있는 데이터, 속도를 가지고있다.

    String model;
    boolean start;
    int speed;

    Car(){}

    public Car(String model, boolean start, int speed){
        this.model = model;
        this.start = start;
        this.speed = speed;

    }

}