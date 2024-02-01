package javaStudy.javaio;

import java.io.*;

public class CharacterConversionEx {
  //UTF-8 문자셋으로 문자열을 파일에 저장하고, 파일에 저장된 문자를 다시 읽어서 콘솔에 출력하는 프로그램
  public static void main(String[] args) throws Exception {
    write("너에게 나를 보낸다.");


  }

  public static void write(String str) throws Exception{
    String fileName = "data.txt";
    OutputStream os = new FileOutputStream("data.txt");
    Writer writer = new OutputStreamWriter(os,"UTF-8"); // 사람이 볼 수 있는 utf-8로 변경하라
    writer.write(str);
    writer.flush();
    writer.close();

    read(fileName);  // read
    read1(fileName);

  }

  public static void read(String fileName) throws Exception{
    InputStream is = new FileInputStream(fileName);
    Reader reader = new InputStreamReader(is,"UTF-8");
    char[] data = new char[100];
    int num = reader.read(data);
    reader.close();
    String str = new String(data);
    System.out.println(str);
  }

  public static void read1(String fileName) throws Exception{
    FileReader is = new FileReader(fileName);
    BufferedReader reader = new BufferedReader(is);
    String data = reader.readLine();
    reader.close();

    System.out.println(data);
  }
}
