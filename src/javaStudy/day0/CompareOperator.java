package javaStudy.day0;

class Student{
    String name;
    int kor;
    int eng;
    int mat;

}

public class CompareOperator {
    public static void main(String[] args) {
        //학생 이름, 과목: 국어,영어,수학 데이터를 입력받아, 총점과평균을 구한후, 평균이 80점 이상이면 '통과 80점 미만이면 '실패'
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("이름, 국어, 영어, 수학 점수를 입력하세요");
//        String name = sc.nextLine();
//        int kor = sc.nextInt();
//        int eng = sc.nextInt();
//        int mat = sc.nextInt();
//
//        int total = kor + eng + mat ;
//        double evg = total / 3.0;
//
//        if(evg>=80){
//            System.out.println("통과");
//        }
//        else{
//            System.out.println("실패");
//        }

        char a = 65;
        int b = 67;

        if (a == b) {
            System.out.println(a==b);
        }else{
            System.out.println(a==b);

        }

        float f1 = 0.1f;
        double f2 = 0.1;
        System.out.println(f1 == f2);
        // 부동소수점 처리하는 방식이 다름
        // (float) 해야됨, 타입을 맞춰줘야함

        String s1 = "신세계";
        String s2 = "신서기";

        System.out.println(s1.equals(s2));



















    }
}
