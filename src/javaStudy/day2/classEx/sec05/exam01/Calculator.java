package javaStudy.day2.classEx.sec05.exam01;

public class Calculator {

    boolean power = false;

    public Calculator(){}

    public Calculator(boolean power) {
        this.power = power;
        if(this.power == true){powerOn();}

    }

    //리턴값이 없는 메소드 선언
    public void powerOn() {
        this.power = true;
        System.out.println("전원이 켜졌습니다.");
    } // 전원을 켰습니다.


    //리턴값이 없는 메소드 선언
    public void powerOff() {
        this.power = false;
        System.out.println("전원을 끕니다.");
    }

//plus 메소드 생성합니다. 호출 시 두 정수 값을 전달받고, 두수를 +연산하여
    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int plus(int x, int y){
        return x+y;
    }

    public double divide (int x, int y){
        return x/(double)y;
    }


    //호출 시 두 정수 값을 전달받고, divide 메소드를 생성합니다. 두 수를 /연산하여
    //호출한 곳으로 결과값 double을 리턴하는 메소드 선언

}