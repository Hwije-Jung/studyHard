package javaStudy.collection.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
  private Scanner sc = new Scanner(System.in);
  private List<Board> boards = new ArrayList<>();
  static int bno = 1;


  public void list() {
    System.out.println();
    System.out.println("[게시물 목록]");
    System.out.println("----------------------------------------------------------");
    System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
    read();

    System.out.println("----------------------------------------------------------");
    mainMenu();
  }

  public void mainMenu() {
    System.out.println();
    System.out.println("1.메인 메뉴: 1.Create | 2.ReadOne | 3.Clear | 4.Exit");
    System.out.println("----------------------------------------------------------");
    System.out.print("메뉴 선택");
    System.out.println();
    String menuNo = sc.nextLine();
    System.out.println();

    switch (menuNo) {
      case "1" -> create();
      case "2" -> readOne();
      case "3" -> clear();
      case "4" -> exit();
      default -> list();
    }
  }

  private void exit() {
    System.out.println("***exit 메소드 실행");
    System.exit(0);
  }

  private void clear() {
    System.out.println("***clear 메소드 실행");
    boards.clear();
    System.out.println("전체 삭제했습니다.");
  }

  private void read() {
    for (Board row : boards) {
      System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBtitle(), row.getBdate());
    }
  }


  private void readOne() {
    boolean isBno = true;
    System.out.println("게시물 번호를 입력해 주세요");
    int bno = Integer.parseInt(sc.nextLine());
    for (Board row : boards) {
      if (row.getBno() == bno) {
        System.out.printf("%-6s%-12s%-16s%-40s\n", row.getBno(), row.getBwriter(), row.getBtitle(), row.getBdate());
        isBno = false;
      }
    }
    if(isBno){
      System.out.println("게시물 번호가 없습니다.");
      return;
    }

    System.out.println("1.Update  |  2.Delete  |  3.List");
    int num = Integer.parseInt(sc.nextLine());
    switch (num) {
      case 1 -> update(bno);
      case 2 -> delete(bno);
      case 3 -> list();
      default -> {
        System.out.println("1~3중입력안했으므로 list로 이동합니다.");
        list();}
    }
  }

  public void update(int bno) {
    System.out.println("***업데이트 메소드실행");

    for (Board row : boards) {
      if (row.getBno() == bno) {
        System.out.println("작성자, 제목입력하세요");
        row.setBwriter(sc.nextLine());
        row.setBtitle(sc.nextLine());
      }
    }
    System.out.println("업데이트 됐습니다.");
    list();
  }

  public void delete(int bno) {
    int getIndext = 0;
    for(Board row : boards){
      if(row.getBno() == bno){
        getIndext = boards.indexOf(row);
      }
    }
    boards.remove(getIndext);

    boards.removeIf(item -> item.getBno() == bno);

    System.out.println("삭제됐습니다.");
    list();
  }

  private void create() {
    System.out.println("****create()메소드 실행됨");
    //게시물의 제목, 내용, 작성자를 Board객체에 저장하여 게시글 하나를 생성한다.
    Board row = new Board();
    System.out.println("[새 게시물 입력]");
    row.setBno(bno++); // 숫자할당 방법!!
    System.out.print("제목 : ");
    row.setBtitle(sc.nextLine());
    System.out.print("내용 : ");
    row.setBcontent(sc.nextLine());
    System.out.print("작성자 : ");
    row.setBwriter(sc.nextLine());
    row.setBdate(getCurrentDate()); // 날짜

    System.out.println("----------------------------------------------------------");
    System.out.println("보조 메뉴: 1. Ok   |   2. Cancel");
    System.out.println("메뉴 선택 ");
    String menuNo = sc.nextLine();
    if (menuNo.equals("1")) {
      try {
        boards.add(row);
        System.out.println("게시물 추가 완료!");
      } catch (Exception e) {
        System.out.println(e.getMessage());
        exit();
      }
    }
    list();
  }

  public String getCurrentDate() {
    SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    String currentDate = date.format(new Date());
    return currentDate;
  }

}
