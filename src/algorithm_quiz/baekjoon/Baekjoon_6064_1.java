package algorithm_quiz.baekjoon;

import java.util.Scanner;

public class Baekjoon_6064_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, n;
    int x, y;
    int num = sc.nextInt();
    boolean tf = false;


    for (int j = 0; j < num; j++) {
      m = sc.nextInt();
      n = sc.nextInt();
      x = sc.nextInt()-1;
      y = sc.nextInt()-1;

      for (int i = x; i < (m * n); i += m) {
        if (i % n == y) {
          System.out.println(i+1);
          tf = true;
          break;
        }
      }
      if (!tf) {
        System.out.println(-1);
      }
      tf = false;
    }

  }
}
