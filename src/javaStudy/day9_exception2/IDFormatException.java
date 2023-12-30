package javaStudy.day9_exception2;
//아이디가 null이거나 지정범위를 벗어난 아이디가
// 입력되었을 경우 발생시키는 사용자 정의 예외클래스
//

public class IDFormatException extends Exception{
  public IDFormatException(String message){
    super(message);
  }
}

//- 예외 상황 메세지를 생성자에서 받는다.
//- Exception 클래스에서 메시지 생성자, 멤버 변수, 메소드를 제공받는다.
//- 예외 메세지를 설정함
//- getMessage()를 통하여 메세지 내용을 확인할 수 있다.
