package javaStudy.threadex.thread;

//main이 동시에 두가지 작업을 처리할 수 있는지 코드로 확인해 봅시다.
public class BeepPrintEx extends Thread{
  public static void main(String[] args) {

    for (int i = 0; i < 3; i++) {
      Thread thread = new Thread() {
        @Override
        public void run() {
//          setName("subThread");
          System.out.println(getName()+"실행 중");
        }
      };
      thread.start();
    }

    Thread mainThread = Thread.currentThread();
    mainThread.setName("I am Mainthread");
    System.out.println(mainThread.getName()+" 실행 중");
  }
}
