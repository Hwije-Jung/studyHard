package boardProject;

import boardProject.boardException.BoardException;
import boardProject.boardException.BoardExceptionList;
import boardProject.boardException.ErrorCode;

import java.util.Scanner;

public class BoardMenu {

  BoardDao boardDao = new BoardDao();
  Scanner sc = new Scanner(System.in);
  BoardExceptionList error = new BoardExceptionList();

  public void printMenu() {
    System.out.println();
    System.out.println("[게시물 목록]");
    System.out.println("-------------------------------------------");
    System.out.printf("%-6s%-14s%-16s%-20s\n", "no", "writer", "date", "title");
    System.out.println("-------------------------------------------");
    boardDao.listBoredsPrint();
    System.out.println("-------------------------------------------");
    mainMenu();
  }

  public void mainMenu() {
    try {
      System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
      System.out.print("메뉴 선택: ");

      String num = sc.nextLine();
      if (error.isNumberSelect(num)) {// 1~9까지 정규식검사
        throw new BoardException(ErrorCode.INVALID_INPUT_SELECT);
        //BoardExeption 으로 throw

      }

      switch (num) {
        case "1" -> { //게시물 추가
          System.out.println("1.OK | 2.NO");
          if ("1".equals(sc.nextLine())) { // 1 OK 선택
            boardDao.addBoard();
          } else System.out.println("==추가하지 않습니다==");
        }
        case "2" -> { //게시물 읽기
          System.out.println("[게시물 읽기]");
          System.out.print("bno입력: ");
          String inputBno = sc.nextLine();
          boardDao.readBoard(inputBno);

          //게시물 목록에 해당 게시물 번호 있는지 검사
          if (boardDao.isBoard(inputBno)) { // bno 목록에 없으면 true반환
            break;
          }

          System.out.println("1.Update | 2.Delete | 3.List");
          String inputNum = sc.nextLine();


          switch (inputNum) {
            case "1" -> boardDao.update(inputBno); //게시물 수정
            case "2" -> boardDao.delete(inputBno); //게시물 삭제
            case "3" -> System.out.println("==리스트로 돌아갑니다.=="); //리스트로 돌아가기
            default -> System.out.println("==잘못입력==");
          }
        }
        case "3" -> { //게시물 전체 삭제
          System.out.println("[게시물 전체 삭제]");
          System.out.println("---------------------------------");
          System.out.println("1.OK | 2.NO");
          String inputNum = sc.nextLine();
          switch (inputNum) {
            case "1" -> boardDao.clear();
            case "2" -> System.out.println("==전체삭제하기 취소==");
            default -> System.out.println("==잘못입력==");
          }
        }
        case "4" -> { //시스템 종료
          System.out.println("게시판 시스템이 종료합니다.");
          System.exit(0);
        }
        default -> { //다시입력
          System.out.println("==메뉴에 있는 입력하세요==");
        }
      }
    } catch (Exception e) {

    }


    printMenu();


  }
}
