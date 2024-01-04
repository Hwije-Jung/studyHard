package algorithm_quiz.baekjoon;

import java.util.Scanner;

public class Baekjoon_1748 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    int length = 0;
    int count = 0;
    int total = 0;
    int nine = 9;

    int n = num;
    while(n > 0){
      n /=10;
      length ++;
    }


    for(int i = 1 ; i< length; i++){
      count = nine*i + count;
      nine*=10;
    }

    int temp = (int)(Math.pow(10,length-1)-1);
    total = (num-temp)*length + count;

    System.out.println(total);

  }
}
