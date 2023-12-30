package algorithm_quiz.zero_base;

import java.util.Scanner;


public class zero_7 {

  public static class Lotto {
    public static int randomNumber() {
      return (int) (Math.random() * 45) + 1;

    }

    public static int countSame(int[] arr1, int[] arr2) {
      int count = 0;
      for (int i = 0; i < arr1.length; i++) {
        for (int j = 0; j < arr1.length; j++) {
          if (arr1[i] == arr2[j]) {
            count++;
          }
        }
      }
      return count;
    }

    public static boolean duplicate(int num, int[] array) { // 중복검사
      for (int i = 0; i < array.length; i++) {
        if (array[i] == num) {
          return false; // 랜덤생성한 수가 배열중에 있으면 false 반환
        }
      }
      return true; // 중복 없으면 true반환
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Lotto lotto = new Lotto();


    System.out.print("[로또 개수를 입력해 수세요.(숫자 1 ~ 10):");
    int num = sc.nextInt();

    int[][] myLotto = new int[num][6]; // 내가산 로또
    int[] realLotto = new int[6];       // 당첨 로또
    char alphabet = 'A';
    int random = 0;

    for (int i = 0; i < num; i++) { // 내 로또번호 랜덤 생성
      System.out.print(alphabet++ + "   ");

      for (int j = 0; j < 6; j++) {

        while (true) { // 중복검사
          random = lotto.randomNumber();
          if (lotto.duplicate(random, myLotto[i])) { //만들어진 숫자와, 로또 한줄
            break;
          }
        }

        myLotto[i][j] = random;
        System.out.printf("%02d ", myLotto[i][j]);
      }
      System.out.println();

    }

    System.out.println("\n로또 발표"); // 당첨로또 발표 생성
    for (int i = 0; i < 6; i++) {

      while (true) {
        random = lotto.randomNumber();
        if (lotto.duplicate(random, realLotto)) {
          break;
        }
      }
      realLotto[i] = random;
      System.out.printf("%02d ", realLotto[i]);
    }

    System.out.println("\n\n[내 로또 결과]");

    alphabet = 'A';

    for (int i = 0; i < num; i++) {
      System.out.print(alphabet++ + "  ");
      for (int j = 0; j < 6; j++) {
        System.out.printf("%02d ", myLotto[i][j]);
      }
      System.out.print("=> " + Lotto.countSame(realLotto, myLotto[i]) + "개 일치");
      System.out.println();
    }
  }
}
