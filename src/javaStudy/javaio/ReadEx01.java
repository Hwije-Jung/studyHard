package javaStudy.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadEx01 {
  public static void main(String[] args) {
    try{
      InputStream is = new FileInputStream("C:/Temp/test1.text");
      while(true){
        int data = is.read(); // 1바이트씩 읽어오겠다.
        if(data == -1 )break; // EOF 파일의 끝(-1)
        System.out.println(data);
      }
      is.close();
    }catch (FileNotFoundException e){  // 파일없으면 잡아낼 필요없다.
      System.out.println("파일이 존재하지 않습니다.");
      e.printStackTrace();
    }
    catch(IOException io){
      io.printStackTrace();
    }
  }
}
