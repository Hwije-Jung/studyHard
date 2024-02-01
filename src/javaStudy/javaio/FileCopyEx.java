package javaStudy.javaio;

import java.io.*;

// 파일 복사 원리
public class FileCopyEx {
  public static void main(String[] args) throws IOException {
    String originFileName = "C:/Temp/dandi.png";
    String targetFileName = "C:/Temp/dandi2.png";


    InputStream is = new FileInputStream(originFileName);
    OutputStream os = new FileOutputStream(targetFileName);

//    byte[] data = new byte[1024];
//    while(true) {
//      int num = is.read(data);
//      if(num == -1) break;
//      os.write(data,0,num);
//    }

    is.transferTo(os);

    os.flush();  // 반드시 다 해제!
    os.close();
    is.close();
  }
}
