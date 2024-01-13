package javaStudy.threadex;

public class ThreadExEx {
  public static void main(String[] args) {
    //1. 상속으로 Thread 생성
    ThreadByInheritance t1 = new ThreadByInheritance();

    //2. Runnable Interface 로 Thread 생성
    Runnable runnable = new ThreadByImplement();
    Thread t2 = new Thread(runnable);
    Thread t3 = new Thread(new ThreadByImplement());

    t1.start();
    t2.start();
    //t1 t2끝나고 메인종료
  }
}

class ThreadByInheritance extends Thread{
  //thread 상속
  @Override
  public void run() { // 오버라이딩
    for (int i = 0; i < 500; i++) {
      System.out.print(0);
    }
  }
}

class ThreadByImplement implements Runnable{
  //Runnable 상속
  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      System.out.print(1);
    }
  }
}