package oop.day9_exception2;

import java.util.Scanner;

public class PasswordMain {
  static Scanner sc = new Scanner(System.in);

  private String pw;

  public String getPW() {
    return pw;
  }

  public void setPW(String pw) throws PasswordCheckException {
    //IDFormatException이 처리해!!
    if (pw == null) {
      throw new PasswordCheckException("패스워드는 null 일 수 없습니다.");
    } else if (pw.length() < 6) {
      throw new PasswordCheckException("5이하는 안됩니다.");
    } else if(!pw.matches("^[a-zA-Z0-9]*$")){
      throw new PasswordCheckException("영문자,숫자만 됩니다.");
    }
    this.pw = pw;
  }

  public static void main(String[] args) {

    PasswordMain pw = new PasswordMain();
    String pass = null;
    try {
      pass = sc.next();
      pw.setPW(pass);
      System.out.println(pw.getPW()+"회원가입 완료");
    }catch (PasswordCheckException p){
      System.out.println(p.getMessage());
    }catch (Exception e){
      System.out.println("예외 발생 다시시작");
    }


  }
}
