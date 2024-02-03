package boardProject;



import boardProject.server.Server;

import java.sql.SQLException;


public class BoardMain {
  public static void main(String[] args) throws SQLException {
    BoardMenu boardMenu = new BoardMenu();
    Server server = Server.getInstance(); // 싱글톤
    server.load();
    boardMenu.printMenu();

  }
}
