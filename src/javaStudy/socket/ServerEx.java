package javaStudy.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
  public static void main(String[] args) {

    try {
      //1. 서버소켓 생성
      ServerSocket serverSocket = new ServerSocket(50001);

      //2. 클라이언트의 socket과 접속 할 수 있도록 accept 서버소켓에 바인드
      System.out.println("server start");
      Socket socket = serverSocket.accept();

      //client가 보낸 메세지 받기
      BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String message = br.readLine();
      System.out.println("client message :" + message);

      //client에 메시지 보내기
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      bw.write("i like you too!!!");
      bw.newLine(); // 한줄 띄기
      bw.flush();


      //3.소켓 종료
      socket.close();

      //4.서버소켓 종료
      serverSocket.close();
      System.out.println("server close");
      br.close();
      bw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
