package javaStudy.day9_exception;

import java.util.Scanner;

public class ExceptionQuiz {
  public static void main(String[] args) {
    int[] array = new int[5];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < 6; i++) {
      try {
        array[i] = sc.nextInt();
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e.getMessage());
        System.out.println(e.toString());
        e.printStackTrace();
      }
    }
  }
}
