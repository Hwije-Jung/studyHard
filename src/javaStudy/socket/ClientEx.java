package javaStudy.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientEx {
  public static void main(String[] args) {
    try{
      Socket socket = new Socket("127.0.0.1",50001);

      //Server에 보낼 데이터 준비하여 보내기
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      bw.write(" i like you");
      bw.newLine(); // 한줄 띄기
      bw.flush();

      //Server에서 보낸 데이터를 받아 출력 하기
      BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
      String message = br.readLine();
      System.out.println("server message :" + message);

      socket.close();
      bw.close();
      br.close();
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
