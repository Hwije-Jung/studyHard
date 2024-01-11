package algorithm_quiz.baekjoon;

import java.util.Scanner;


public class Baekjoon_15649 {

  //1~N 까지
  //M 개

  public static void func(int N){
    int i =1;
    if(i==N){
      return;
    };
    System.out.println(N);
    func(i+1);
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    //생성자, 컴페어, 클래스 룰
    //컴페어 투를 오버라이딩해야하고

    func(N);

//    int count = N;
//
//    for (int i = M - 1; i > 0; i--) {
//      count *= (N - i);
//
//    }
//
//    int inc =1;
//
//    for (int i = 0; i < count; i++) {
//      for(int j = 3; j<M; j++){
//        System.out.print(i);
//      }
//    }




  }
}





