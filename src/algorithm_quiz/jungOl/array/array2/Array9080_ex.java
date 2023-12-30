package algorithm_quiz.jungOl.array.array2;

public class Array9080_ex {
  public static void main(String[] args) {
    int[][] array = new int[5][5];

    for (int i = 0; i < 5; i++) {
      array[i][0] = 1;
    }
    for (int i = 0; i < 5; i++) {
      System.out.print(array[i][0] + " ");

      for (int j = 1; j <= i; j++) {

        array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
        System.out.print(array[i][j] + " ");

      }
      System.out.println();
    }
  }
}
