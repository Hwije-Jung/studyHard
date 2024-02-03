package boardProject.boardException;

import boardProject.server.Server;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoardExceptionList {

  private static volatile BoardExceptionList instance;
  public static BoardExceptionList getInstance() {  //싱글톤
    if (instance == null) {
      synchronized (BoardExceptionList.class) {
        if (instance == null) {
          instance = new BoardExceptionList();
        }
      }
    }
    return instance;
  }
  public static boolean isNumberSelect(String select) {
    String regex = "[1-9]"; // 1~9숫자만 입력
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(select);
    if (m.matches()) { //정규식이 맞으면 false 반환
      return false;
    }
    return true; // 틀리면 true 반환
  }


  public static boolean isValidSelect(String select) {
    String regex = "[1-2]"; // 1~2숫자만 입력
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(select);
    if (m.matches()) { //정규식이 맞으면 false 반환
      return false;
    }
    return true; // 틀리면 true 반환
  }
}
