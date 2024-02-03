package boardProject;

import boardProject.boardException.BoardException;
import boardProject.boardException.BoardExceptionList;
import boardProject.boardException.ErrorCode;

import java.text.SimpleDateFormat;
import java.util.*;

public class BoardDao {
  public Map<Integer, Board> boardMap = new HashMap<>(); // Board 해쉬맵
  BoardExceptionList error = new BoardExceptionList(); // 예외처리 클래스 객체생성

  Scanner sc = new Scanner(System.in);
  static int i = 1; // 게시물 번호

  // 게시물 전체 출력
  public void listBoredsPrint() {

    //순서가 필요함.
    Set<Integer> keyset = boardMap.keySet(); // boardMap의 키 Set으로 만듦
    Iterator<Integer> keIterator = keyset.iterator(); //그 키들의 Iterator 만듦

    while (keIterator.hasNext()) { // Iterator돌리기
      int key = keIterator.next(); // 키 가져오기
      boardPrint(key, boardMap);
    }
  }

  // 게시물 한 개 정보 출력
  public void boardPrint(int key, Map<Integer, Board> boardMap) { // key와 Map을 받음
    System.out.printf("%-6d%-12s%-16s%-20s\n", boardMap.get(key).getBno(), boardMap.get(key).getBwriter(), boardMap.get(key).getData(), boardMap.get(key).getBtitle());
  }

  // 날짜 반환
  public String getDate() {
    SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
    String day = date.format(new Date());
    return day;
  }

  // 입력받은 게시물 번호가 존재하는지 검사
  public boolean isBoard(String inputBno){
    boolean isBoard = true;

    Set<Integer> ketSet = boardMap.keySet();
    for(int key : ketSet){
      if(boardMap.get(key).getBno() == Integer.parseInt(inputBno)){
        isBoard = false;
        return isBoard;
      }
    }

    return isBoard;
  }

  // 게시물 추가
  public void addBoard() {
    System.out.print("제목입력: ");
    String title = sc.nextLine();
    System.out.print("내용입력: ");
    String content = sc.nextLine();
    System.out.print("작성자 입력: ");
    String writer = sc.nextLine();

    Board newBoard = new Board(i++, title, content, writer, getDate());
    boardMap.put(newBoard.getBno(), newBoard);
  }

  // 게시물 한 개 선택 후 정보 출력
  public void readBoard(String inputBno) {
    try {
      Set<Integer> keySet = boardMap.keySet();
      int cnt = 0;

      for (int key : keySet) {
        if (boardMap.get(key).getBno() == Integer.parseInt(inputBno)) {
          cnt++;
          boardPrint(key, boardMap);
        }
      }
      if (cnt == 0) {
        throw new BoardException(ErrorCode.BOARD_NO_INFORMATION);
      }
    } catch (Exception e) {
//      e.printStackTrace();
    }
  }

  //게시물 수정
  public void update(String inputBno) {
    try {
      System.out.println("수정 내용 입력");
      System.out.print("제목: ");
      String title = sc.nextLine();
      System.out.print("내용: ");
      String content = sc.nextLine();
      System.out.print("작성자: ");
      String writer = sc.nextLine();

      System.out.println("1.OK | 2.Cancel");

      String select = sc.next();
      if (error.isValidSelect(select)) { // 1,2 중 선택가능한 정규식 검사
        throw new BoardException(ErrorCode.INVALID_INPUT_SELECT); // 예외처리
      }
      switch (select) {
        case "1" -> { // 수정할 게시물 1.OK 선택
          Set<Integer> setKey = boardMap.keySet();
          for (int key : setKey) {
            if (boardMap.get(key).getBno() == Integer.parseInt(inputBno)) {
              boardMap.get(key).setBtitle(title);
              boardMap.get(key).setBcontent(content);
              boardMap.get(key).setBwriter(writer);
            }
          }
          System.out.println("==수정 완료==");
        }
        case "2" -> {
          System.out.println("==수정하지 않습니다.==");
        }
      }

    } catch (Exception e) {

    }
  }

  //선택한 게시물 삭제
  public void delete(String inputBno) {
    try {
      Set<Integer> keySet = boardMap.keySet();
      int cnt = 0;
      for (int key : keySet) {
        if (boardMap.get(key).getBno() == Integer.parseInt(inputBno)) {
          boardMap.remove(key);
          cnt++;
          System.out.println("==삭제되었습니다==\n");
        }
      }
      if (cnt == 0) {
        throw new BoardException(ErrorCode.BOARD_NO_INFORMATION);
      }
    } catch (Exception e) {
//      e.printStackTrace();
    }

  }

  // 게시물 전체 삭제
  public void clear() {
    boardMap.clear();
    System.out.println("==전체삭제되었습니다==");
  }


}
