package javaStudy.threadex;

import javax.swing.*;
//sleep(long millis) : 지정된 시간동안 스레드를 멈춘다.
// static method이기 때문에
public class ThreadDemo1 {
  public static void main(String[] args) {
    Thread t1 = new Thread(new CountDownThread());
    t1.start();

    //사용자 입력
    String name = JOptionPane.showInputDialog("이름을 입력하세요!");
    System.out.println("이름은 " + name + "입니다.");


  }
}
class CountDownThread implements Runnable {

  @Override
  public void run() {
    for (int i = 10; i > 0; i--) {
      System.out.println(i);
    }
  }
}
