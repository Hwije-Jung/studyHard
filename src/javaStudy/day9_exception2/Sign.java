package javaStudy.day9_exception2;

import java.util.Scanner;

public class Sign {

  static Scanner sc = new Scanner(System.in);

  private String id;
  private String pw;

  public void setPW(String pw) throws PasswordCheckException {
    //IDFormatException이 처리해!!
    if (pw == null) {
      throw new PasswordCheckException("패스워드는 null 일 수 없습니다.");
    } else if (pw.length() < 6) {
      throw new PasswordCheckException("패스워드 5이하는 안됩니다.");
    } else if(!pw.matches("^[a-zA-Z0-9]*$")){
      throw new PasswordCheckException("패스워드 영문자,숫자만 됩니다.");
    }
    this.pw = pw;
  }

  public void setUserID(String userID) throws IDFormatException {
    //IDFormatException이 처리해!!
    if (userID == null) {
      throw new IDFormatException("아이디는 null 일 수 없습니다.");

    } else if (userID.length() < 8 || userID.length() > 20) {
      throw new IDFormatException("아이디는 8자 이상 , 20자 이하만 가능합니다.");

    }
    this.id = userID;
  }
  public static void main(String[] args) {
    Sign sign = new Sign();
    String id = null;
    String pw = null;

    try{
      id = sc.next();
      sign.setUserID(id);
    } catch (IDFormatException e){
      System.out.println(e.getMessage());
    } catch (Exception e){
      System.out.println("예외 발생 다시시작");
    }

    try{
      pw = sc.next();
      sign.setPW(pw);
    } catch (PasswordCheckException e){
      System.out.println(e.getMessage());
    } catch (Exception e){
      System.out.println("예외 발생 다시시작");
    }
  }
}
