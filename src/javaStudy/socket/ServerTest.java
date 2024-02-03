package javaStudy.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
  public static void main(String[] args) {
    try{
      ServerSocket serverSocket = new ServerSocket(50002);
      Socket socket = serverSocket.accept();

      BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      System.out.println(br.readLine());

      br.close();
      serverSocket.close();
      socket.close();
    }catch (IOException e){
      e.printStackTrace();
    }
  }
}
