package oop.day9_exception;

public class ExceptionHandlingEx1 {
  public static void main(String[] args) {
    System.out.println("[프로그램시작]");
    printLength("자바프로그램입니다.");
    printLength(null);
    System.out.println("[프로그램 종료]");
    //해당 블록이 끝났다. 메인 영역
  }
  //예외가 발생하더라도

  private static void printLength(String s) {
    try {
      int result = s.length();
      System.out.println("문자 수: "+result);
    }catch (NullPointerException e){
      System.out.println(e.getMessage());
      // 에러 출력방식 1 : 에러의 원인을 간단하게 출력
      System.out.println("입력데이터가 잘 못되었습니다. 다시 입력하세요");
      // 에러 출력방식 1 : 사용자 편하게
      System.out.println(e.toString());
      //예외 출력방식 2 : exception의 내용과 원인 출력
      e.printStackTrace();
      //예외 출력방식 3 : 에러의 발생 근원지를 찾아 단계별로 에러를 출력
      // 개발자입장에서 이게 유리
    }

  }
}
