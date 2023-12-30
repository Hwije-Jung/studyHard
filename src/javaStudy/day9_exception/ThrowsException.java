package javaStudy.day9_exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
  public static void main(String[] args) {
    ThrowsException test = new ThrowsException();
    try{
      test.loadClass("src/oop/day9_exception/data.txt","java.lang.String");
    }catch (FileNotFoundException f ){ //이순서로 처리하는게 맞아
      f.printStackTrace();
      // 문제가 생긴 내용을 파이렝 저장할 것을 log 라고한다.
      // 내 작업리스트를 저장해 놓고 있다.
    }catch (ClassNotFoundException cf){
      cf.printStackTrace();
    }catch (Exception e){
      e.printStackTrace();
    }
//    catch (FileNotFoundException | ClassNotFoundException cf){ //Surround try/multi-chatch 선택하여 생성
//      cf.getMessage();
//    }
  }
  //throws 예외 처리 미루기: 니가 호출한건 니가 처리해 니가싼똥 니가처리해
  //나를 호출한 그 위치로 다시 던져주기
  private Class loadClass(String fileName, String className) throws FileNotFoundException,ClassNotFoundException {
    // exception발생하면 메인으로 던진다. !
    // throws를 이용해서 예외처리를 미룬 것
    // 나를 호출한 니가 처리하고 정상적으로 처리해
    FileInputStream fis = new FileInputStream(fileName);
    Class c = Class.forName(className);
    return c;

  }


}
