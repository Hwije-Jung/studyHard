package javaStudy.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientTest {
  public static void main(String[] args) {
    try{
      Socket socket = new Socket("127.0.0.1",50002);

      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
      bw.write("안녕~~~~~~~~");
      bw.newLine();
      bw.flush();

      bw.close();
      socket.close();
    }catch (IOException e){
      e.printStackTrace();
    }

  }
}
