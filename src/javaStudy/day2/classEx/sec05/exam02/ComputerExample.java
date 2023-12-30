package javaStudy.day2.classEx.sec05.exam02;

public class ComputerExample {
	public static void main(String[] args) {
		//Computer 객체 생성
		Computer computer = new Computer();

		int result1 = computer.sum(1,2,3);
		int result2 = computer.sum(1,2,3,4,5);
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		int result3 = computer.sum(values);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);


		//sum() 메소드 호출 시 매개값 1, 2, 3을 제공하고
		//합산 결과를 리턴 받아 result1 변수에 대입


		//sum() 메소드 호출 시 매개값 1, 2, 3, 4, 5를 제공하고
		//합산 결과를 리턴 받아 result2 변수에 대입


		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴 받아 result3 변수에 대입


		//sum() 메소드 호출 시 배열을 제공하고
		//합산 결과를 리턴 받아 result4 변수에 대입

	}
}