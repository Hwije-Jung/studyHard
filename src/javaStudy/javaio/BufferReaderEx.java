package javaStudy.javaio;

import java.io.*;
import java.net.InetSocketAddress;

public class BufferReaderEx {
  public static void main(String[] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
    String str1 = "text 생성";
    String str2 = "text 생성";
    bw.write(str1,0,str1.length());
    bw.newLine();
    bw.write(str2,0,str2.length());
    bw.flush();


    BufferedReader br = new BufferedReader(new FileReader("test.txt"));
    String str;
    while(true){
      str = br.readLine();
      if(str == null) break;
      System.out.println(str);
    }

    bw.close();
    br.close();
  }
}
