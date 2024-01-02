package javaStudy.day0;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
//        int charCode = 'x';
//
//        //charCode 의 값이 대문자인지 소문자인지 판별해 봅시다
//        if(charCode>=65 && charCode<90){
//            System.out.println("대문자");
//        }
//        else if(charCode>=97 && charCode<122){
//            System.out.println("소문자");
//        }

        Scanner sc = new Scanner(System.in);

        // Scanner 클래스 하나의 데이터를 받아서 문자인지 숫자인지를 구분하여 출력하세요
        //만약 해당 데이터가 숫자라면 0~9까지의 숫자인지를 확인해서 추가적으로
        //범위의 값이라고 하면 0~9까지의 수이군요! 출력
//
//
//       char num = sc.next().charAt(0);
//
//        if(num >=48 && num<=57){
//            System.out.println("0~9까지 수이군뇨!");
//        }
//        else if((num>=65 && num<90)||(num>=97 && num<112)){
//            System.out.println("영문자 이군뇨!");
//        }

        //%연산자를 이용하여 입력받은 데이터(숫자가2 또는 3의 배수인지 구분)
        //출력: 2또는 3의 배수라면 "2또는 3의배수이군뇨"

//        int n = sc.nextInt();
//
//        if(n%2 ==0 || n%3==0){
//            System.out.println("2또는 3의 배수균뇨!");
//        }

        int x =0;
        x +=1;
        System.out.println(x);




    }
}
