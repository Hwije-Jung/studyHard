package javaStudy.socket;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx01 {
  public static void main(String[] args) {

    try {
      //1. 서버소켓 생성
      ServerSocket serverSocket = new ServerSocket(50001);

      //2. 클라이언트의 socket과 접속 할 수 있도록 accept 서버소켓에 바인드
      System.out.println("server start");
      Socket socket = serverSocket.accept();

      //3.소켓 종료
      socket.close();
      System.out.println("server close");
      //4.서버소켓 종료
      serverSocket.close();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
