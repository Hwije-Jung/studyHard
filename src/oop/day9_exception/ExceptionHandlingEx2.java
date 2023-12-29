package oop.day9_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingEx2 {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("프로그램시작");
    FileInput();
    System.out.println("프로그램종료");
    // 예외가 발생해도 종료 되지 않도록 try-catch로 예외처리
  }

  public static void FileInput() {
    FileInputStream fis = null;
    try {
      fis = new FileInputStream("src/oop/day9_exception/data.txt");
      System.out.println("파일 읽기 완료");

    } catch (FileNotFoundException e) {
      System.out.println("해당 파일이 존재하지 않습니다.");
      e.printStackTrace();
      System.out.println(e.getMessage());
      System.out.println(e);
      return;
    } finally {//닫혀있을 때
      try {
        if (fis != null) {
          fis.close(); // 닫을때 문제가 생기면
        }
      }catch (IOException io1){ // 인풋아웃풋의 모든 예외처리
        io1.printStackTrace();
      }
    }
    System.out.println("예외 처리 후 수행됨");
  }


//예외 처리는 프로그램이 비정상 종료되는 것을 방지하는 중요한 역할을 한다.
}
