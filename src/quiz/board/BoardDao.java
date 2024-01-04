package quiz.board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
  List<Board> boardList = new ArrayList<>();
  Scanner sc = new Scanner(System.in);
  static int bno = 1;

  public void list() {
    System.out.println("게시물 목록");
    System.out.println("=============================================");
    System.out.printf("%-6s%-12s%-12s%-12s\n", "no", "writer", "date", "title");
    System.out.println("=============================================");
    mainMenu();
    System.out.println("=============================================");
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택:");

    int selectNum = Integer.parseInt(sc.nextLine());

    switch (selectNum){
      case 1 -> createBoard();
      case 2 -> read();
    }

  }

  public void createBoard(){
    Board board = new Board();
    System.out.println("[새 게시물 입력]");
    board.setBno(bno++);
    System.out.print("제목: ");
    board.setBtitle(sc.nextLine());
    System.out.print("내용: ");
    board.setBcontent(sc.nextLine());
    System.out.print("작성자: ");
    board.setBwriter(sc.nextLine());
    board.setDate(getDate());

    boardList.add(board);

    list();
  }

  public void read(){
    System.out.print("찾을 책 번호 입력:");
    int inputBno = Integer.parseInt(sc.nextLine());
    System.out.println("[게시물 읽기]");
    for (Board row : boardList ) {
      if(row.getBno() == inputBno){
        System.out.println("################");
        System.out.println("번호: "+row.getBno());
        System.out.println("제목: "+row.getBtitle());
        System.out.println("내용: "+row.getBcontent());
        System.out.println("작성자: "+row.getBwriter());
        System.out.println("날짜: "+row.getDate());
        System.out.println("################");

      }
    }
  }

  public String getDate (){
    SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
    String currentDate = date.format(new Date());
    return currentDate;
  }

  public void mainMenu() {
    for (Board row : boardList) {
      System.out.printf("%-6s%-6s%-6s%-6s\n", row.getBno(), row.getBwriter(), row.getDate(), row.getBtitle());
    }

  }
}
