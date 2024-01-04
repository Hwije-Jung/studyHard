package algorithm_quiz.baekjoon;

import java.util.Scanner;

public class Baekjoon_9095 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] array = new int[11];
    array[0] = 1;
    array[1] = 2;
    array[2] = 4;

    for (int i = 3; i < 11; i++) {
      array[i] = array[i-1]+array[i-2]+array[i-3];
    }

    for (int i = 0; i < n; i++) {
      int inputNum = sc.nextInt();
      System.out.println(array[inputNum-1]);
    }

  }
}
