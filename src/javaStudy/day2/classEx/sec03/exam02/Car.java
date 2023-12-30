package javaStudy.day2.classEx.sec03.exam02;

public class Car {
	//필드 선언
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int speed;

	// 2. 생성자 오버로딩 한다.
	// 모든 클래스의 생성자는 해당 클래스의 접근제한자를 따른다.
	//리턴 타입이없다, 클래스이름과 같다 : 생성자
	//생성자는 메소드와 비슷하지만 , 리턴타입이 없고 클래스 이름과 동일하다.
	//생성자의 매개변수는 new 연산자로 생성자를 호출할때, 매개값을 생성자 블록 내부로 전달하는 역할을 한다.

	public Car(String company, String model, String color, int maxSpeed, int speed) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = speed;
	}

	Car(){}

	Car(String company, String model, String color){
		this.company = company;
		this.model = model;
		this.color = color;
	}

	//3 . 모든 필드는 private 변경한다.

	public String getCompany() {
		return company;
	}

	public String getModel() {
		return model;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public String getColor() {
		return color;
	}

//4. company, model , maxSpeed 는 객체가 생성되면 변경할 수 없고,
	// 읽기만 가능하도록 재구성 하세요

	//5. speed 멤버는 읽기 쓰기가 가능하도록 public setter getter 메소드를 작성하시요
	//단 스피드는 200을 넘으면 경고


	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}