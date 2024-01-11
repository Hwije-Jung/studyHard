package javaStudy.lamda;

public class Solution5 {
  private static int[] scores = {10, 50, 3};

  public static int maxOrMin(Operator operator) {
    int result = scores[0];
    for (int score : scores) {
      result = operator.apply(result, score);

    }
    return result;
  }

  public static void main(String[] args) {
    Operator maxOper = (x, y) -> x > y ? x : y;
    Operator minOper = (x, y) -> x < y ? x : y;

    int max = maxOrMin(maxOper);
    int max2 = maxOrMin((x, y) -> x > y ? x : y);
    int max3 = maxOrMin(Math::max);
    System.out.println("최대값 : "+max);

    int min = maxOrMin(minOper);
    System.out.println("최소값 :"+min);
  }
}
