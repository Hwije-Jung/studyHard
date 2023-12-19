package oop.day2.classEx.sec03.exam01;
//데이터 처리으 ㅣ기본 기능 : CRUD creat read update delete
import model.test.C;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar = new Car();
		Car ionic = new Car("아이오닉",false,0);
		Car twizy = new Car("트위지",false,0);
		Car morning = new Car("모닝",false,0);
		Car spark = new Car("스파크",false,0);


		// 배열
		// Car 타입을 저장할 수 있는 myCarArray (5대 주차)
		Car[] myCarArray = new Car[5];

		//myCar model : 그랜저 speed : 100
		myCar.model = "그랜저";
		myCar.speed = 100;
		myCar.start = true;

		//Car 객체의 필드값 읽기
		System.out.println(myCar.model);
		System.out.println(myCar.speed);
		System.out.println(myCar.start);

		//myCarArray 차고에 1번째 공간에 그랜저를 주차하세요
		myCarArray[0] = myCar;
		System.out.println(myCarArray[0].model);
		System.out.println(myCarArray[0].speed);
		System.out.println(myCarArray[0].start);

		//myCarArray 주차공간에 그랜저, 아이오닉, 트위지, 모닝, 스파크
		myCarArray[1] = ionic;
		myCarArray[2] = twizy;
		myCarArray[3] = morning;
		myCarArray[4] = spark;

		for(Car car : myCarArray){
			System.out.println(car.model+" "+car.start+" "+car.speed);
		}



	}
}