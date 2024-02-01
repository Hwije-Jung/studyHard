package javaStudy.javaio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// c://temp/test1.text 파일에 10 20 30 데이터를 쓰자
public class WriterEx01 {
  public static void main(String[] args) {
    //trty catch 항상필요함, 외부에 서 인터럽트 발생할 수 있기 때문
    try{
      OutputStream os = new FileOutputStream("C:/Temp/test1.text");
      byte[] a = {10,20,30,40,50};
      os.write(a);
      os.flush();
      os.close();


    }catch(IOException io){
      io.printStackTrace();
    }
  }
}
