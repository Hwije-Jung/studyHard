package javaStudy.day0;

public class IfEx01 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        //점수를 입력 받아서 100-90 'A' 89!~80 'B' 79~70 c 70미만 F
//        // 75점이 입력되었다면 점수는 75점 학점 C입니다.
//
//        int score = input.nextInt();
//        char grade;
//
//        if(score >=90){
//            grade = 'A';
//        }
//        else if(score >= 80){
//            grade = 'B';
//        }
//        else if(score >=70){
//            grade = 'C';
//        }
//        else{
//            grade = 'F';
//        }
//
//        System.out.println("점수는"+score+", 학점은 "+grade+"입니다.");


        //Math.random() 주사위를 굴려서 1~6 중의 하나의값을 뽑아서 뽑힌 숫자 출력

        int number = (int)(Math.random()*10)+1;

//      System.out.println(Math.random()*45+1);

        System.out.println(number);
    }
}
