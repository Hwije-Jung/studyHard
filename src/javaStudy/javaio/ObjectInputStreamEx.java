package javaStudy.javaio;

import java.io.*;
import java.util.Arrays;

public class ObjectInputStreamEx {
  public static void main(String[] args) throws Exception{
    FileOutputStream fos = new FileOutputStream("object.dat");
    ObjectOutputStream oos = new ObjectOutputStream(fos); // 직렬화해서 object.dat에 쓰겠다.

    // 객체생성
    Member member = new Member("박진영",20);
    int[] arry = {1,2,3};

    //객체를 역직렬화해서 파일에 저장
    oos.writeObject(member);
    oos.writeObject(arry);

    oos.flush();
    oos.close();
    fos.close();

    FileInputStream fis = new FileInputStream("object.dat");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Member m1 = (Member)ois.readObject();
    int[] arr2 = (int[]) ois.readObject();

    ois.close();
    fis.close(); // 바깥꺼서부터 차례차례 닫기

    System.out.println(m1.name);
    System.out.println(m1.age);
    System.out.println(Arrays.toString(arr2));
  }
}
