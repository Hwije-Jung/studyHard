package javaStudy.lamda;

@FunctionalInterface
interface Operator{
  public int apply(int x, int y);
}
public class Example {
  private static int[] scores = {10,50,3};

  public static int maxOrMin(Operator operator){
    int result = scores[0];
    for(int score : scores){
      result = operator.apply(result,score);
    }
    return result;
  }

  public static void main(String[] args) {
    int max = maxOrMin(
            (x,y)->Math.max(x,y)
    );
    System.out.println(max);

    int min = maxOrMin(
            (x,y)->Math.min(x,y)
    );
    System.out.println(min);

 
  }
}
