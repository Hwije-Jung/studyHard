package javaStudy.threadex.sleep;

import javax.swing.*;

//Single Thread
// interupt 메소드: 쓰레드를 안전하게 종료시킬 때 사용한다. 스레드를 실행 도중 종료 시키고 싶을때 사용
public class ThreadDemo {
  public static void main(String[] args) {
    Thread t1 = new Thread(new ThreadE());
    t1.start();
    String yes = JOptionPane.showInputDialog("게임을 다시 진행할까요? Y/N");
    System.out.println(yes);

    t1.interrupt(); //실행도중 안전하게 강제 종료
    System.out.println("isInterrupted : "+t1.isInterrupted());

  }
}

class ThreadE extends Thread{
  @Override
  public void run() {

    int i = 10;
    while (!Thread.currentThread().isInterrupted()){
      System.out.println(i--);
      for(long x =0;x<2500000L;x++){

      }
    }
    System.out.println(Thread.currentThread().getName()+"카운트다운종료");
  }
}

//ThreadEx1은
//동작순서 1. 자신의 이름을 출력
//2. *20번 출력하는 동작을 합니다.
//3. *20번 출력한 후, 자신의 [이름, 종료]메시지 출력
