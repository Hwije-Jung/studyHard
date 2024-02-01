package javaStudy.javaio;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
  public static void main(String[] args) throws IOException {
    Reader reader = new FileReader("C:/Temp/test3.text");


    char[] data = new char[100];  // 버퍼 담아서 빠르게 출력
    while(true){
      int n = reader.read(data);  //읽은 문자를 배열에 저장해서 읽은 문자를 리턴하겠다.
      if(n == -1 ) break;
      for(char c: data) System.out.println(c);
    }



    //1문자씩 읽어들이기
    Reader reader1 = new FileReader("C:/Temp/test3.text");


    while(true){
      int n = reader1.read();  //읽은 문자를 배열에 저장해서 읽은 문자를 리턴하겠다.
      if(n == -1 ) break;
      System.out.println((char)n);
    }

    reader.close();
  }
}

