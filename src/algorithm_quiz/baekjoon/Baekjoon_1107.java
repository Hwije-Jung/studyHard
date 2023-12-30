package algorithm_quiz.baekjoon;

import java.util.Scanner;

public class Baekjoon_1107 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int xNum = sc.nextInt();
    int[] array = new int[xNum];
    for(int i = 0 ;i<array.length;i++){
      array[i] = sc.nextInt();
    }
  }
}
