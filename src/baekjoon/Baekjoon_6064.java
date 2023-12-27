package baekjoon;

import java.util.Scanner;

public class Baekjoon_6064 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m, n;
    int x, y;
    int startX = 0;
    int startY = 0;
    int count = 0;
    boolean first = false;

    int num = sc.nextInt();


    for (int i = 0; i < num; i++) {
    m = sc.nextInt();
    n = sc.nextInt();
    x = sc.nextInt();
    y = sc.nextInt();
    while (true) {
      count++;
      startX++;
      startY++;

      if (startX == m + 1) {
        startX = 1;
      }
      if (startY == n + 1) {
        startY = 1;
      }

      if ((startX == 1 && startY == 1)&&first) {
        count = -1;
        break;
      }

      if (startX == x && startY == y) {
        break;
      }

      first = true;


    }
    System.out.println(count);
    startX = 0;
    startY = 0;
    count = 0;
    first = false;
    }


  }
}
