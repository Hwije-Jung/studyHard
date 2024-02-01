package javaStudy.javaio.memo;


public class Main {
  public static void main(String[] args)  {
    Menu menu = new Menu();
    MemoDao memoDao = MemoDao.getInstance(); // 싱글톤

    memoDao.load();  // 파일에 저장된 데이터 들고오기
    menu.printMenu();  // 메뉴 출력
  }



}
