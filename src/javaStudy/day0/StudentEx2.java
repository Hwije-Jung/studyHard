package javaStudy.day0;
import java.util.Scanner;

public class StudentEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요");
        String name=sc.nextLine();
        int kor=sc.nextInt();
        int eng=sc.nextInt();
        int mat=sc.nextInt();
        char grade;
        int total = kor+eng+mat;
        double avg = total/3.0;

        if(avg>=90){
            grade='A';
        }
        else if(avg>=80){
            grade='B';
        }
        else if(avg>=70){
            grade='C';
        }
        else if(avg>=60){
            grade='D';
        }
        else{
            grade='F';
        }

        System.out.println(name+"학생의 과목 평균은 "+avg+"점이고 학점은 '"+grade+"' 입니다.");
    }
}
