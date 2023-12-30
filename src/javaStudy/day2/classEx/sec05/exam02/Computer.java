package javaStudy.day2.classEx.sec05.exam02;

public class Computer {
	//가변길이 매개변수를 갖는 메소드 선언

    boolean power = false;
    int sum(int ... values){
        int sum = 0;
        for(int i = 0 ; i<values.length;i++){
            sum+=values[i];
        }
        return sum;

    }

    boolean isPower(){
        if(power){
            System.out.println("컴퓨터전원ㅋ져어ㅣㄹㄴㅅ이ㅓㅏ");
            return true;
        }
        System.out.println("전원이 꺼짐");
        return false;
    }
}

//return 문: 메소드의 실행을 강제 종료, 호출한곳으로 제어가 이동한다.