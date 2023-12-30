package quiz.morningQuiz;

import java.util.Scanner;

public class Quiz {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String select = "";
    int quntity = 0;
    int[] scores = new int[1];

    while (true) {
      System.out.println("-----------------------------------------------");
      System.out.println("1.학생수\t|2.점수입력\t|3.점수리스트\t|4.분석\t|5.종료");
      System.out.println("-----------------------------------------------");
      System.out.print("선택> ");
      select = sc.nextLine();

      if (select.equals("1")) {
        System.out.print("학생수> ");
        quntity = Integer.parseInt(sc.nextLine());
        scores = new int[quntity];

      }

      if (select.equals("2")) {
        for (int i = 0; i < quntity; i++) {
          System.out.print("scores[" + i + "]> ");
          scores[i] = Integer.parseInt(sc.nextLine());
        }
      }
      if(select.equals("3")){
        for (int i = 0; i < scores.length; i++) {
          System.out.println("scores["+i+"]: "+scores[i]);

        }
      }
      if(select.equals("4")){
        int max=0;
        int total=0;
        for (int i = 0; i < scores.length; i++) {
          total+=scores[i];
          if(scores[i]>max){
            max = scores[i];
          }
        }
        System.out.print("최고 점수: "+max+"\n");
        System.out.printf("평균 점수: %.1f\n",(double)total/scores.length);
      }
      if(select.equals("5")){
        System.out.println("프로그램 종료");
        break;
      }


    }


  }
}
