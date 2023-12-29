package oop.day9_exception2;

import java.util.Scanner;

public class LoginExample {

  private String id = "qwert12345";
  private String pw = "qwert12345";

  static Scanner sc = new Scanner(System.in);

  public void Check(String id, String pw) throws NotExitIDWrongPasswordException {
    if (id == null) {
      throw new NotExitIDWrongPasswordException("id null이 될 수 없습니다.");
    } else if (!this.id.equals(id)) {
      throw new NotExitIDWrongPasswordException("id 일치하지 않습니다.");
    }

    if (pw == null) {
      throw new NotExitIDWrongPasswordException("pw null이 될 수 없습니다.");
    } else if (!this.pw.equals(pw)) {
      throw new NotExitIDWrongPasswordException("pw 일치하지 않습니다.");
    }
    System.out.println("로그인 확인");
  }

  public void tRy(String id, String pw) {
    LoginExample login = new LoginExample();
    try {
      login.Check(id, pw);
    } catch (NotExitIDWrongPasswordException n) {
      System.out.println(n.getMessage());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    LoginExample login = new LoginExample();

    String id = null;
    String pw = null;

    id = sc.next();
    pw = sc.next();

    login.tRy(id, pw);



  }
}
