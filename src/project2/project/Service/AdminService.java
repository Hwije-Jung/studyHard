package project2.project.Service;

import project2.project.vo.Admin;

import java.util.Scanner;

public class AdminService {

  Admin admin;


  public AdminService(Admin admin) {
    this.admin = admin;
  }

  public void menuAdminLogin() {

    System.out.println("관리자 정보를 입력하세요");

    Scanner sc = new Scanner(System.in);
    System.out.println("아이디 :");
    String adminId = sc.next();
    System.out.println("비밀번호 :");
    String adminPW = sc.next();

    if (admin.getId().equals(adminId) && admin.getPassword().equals(adminPW)) {
      System.out.println("이름" + admin.getName() + " 연락처 " + admin.getPhone());
      System.out.println("아이디" + admin.getId() + " 비밀번호 " + admin.getPassword());
    } else {
      System.out.println("관리자 정보가 일치하지 않습니다.");
    }
  }
}
