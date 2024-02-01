package javaStudy.javaio.memo;

import java.util.Scanner;

public class Menu {
  Scanner sc = new Scanner(System.in);
  MemoDao memoDao = MemoDao.getInstance();

  public void printMenu() {
    System.out.println("------------------------------------------------------------------");
    System.out.println("메모 추가: 1 | 메모 검색: 2 | 메모 리스트: 3 | 메모 삭제: 4 | 저장: 5");
    System.out.println("-------------------------------------------------------------------");
    System.out.println();
    menu();
  }

  public void menu() {
    String menuInput = sc.nextLine();  // 메뉴 선택

    switch (menuInput) {
      case "1" -> memoDao.add();  // 메모 추가
      case "2" -> {               // 읽을 메모
        System.out.println("==확인할 메모 번호를 입력하세요==");
        System.out.print("번호 입력 : ");
        int num = Integer.parseInt(sc.nextLine());
        memoDao.getMemo(num);
      }
      case "3" -> { // 메모 리스트
        memoDao.list();
        System.out.println("==세부내용을 보시겠습니가? 아님 Enter 나 0 치셈==");
        String detailTF = sc.nextLine();
        if(detailTF.equals("") || detailTF.equals("0")){
          // 엔터나 0을 치면 넘어감
        }
        else {
           memoDao.getMemo(Integer.parseInt(detailTF));
           // 해당 메모 가져옴
        }
      }
      case "4" -> memoDao.delete();  // 메모 삭제
      case "5" -> memoDao.save();    // 저장
      default -> {
        printMenu();
      }
    }
    printMenu();
  }
}
