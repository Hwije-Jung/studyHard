package oop;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student("손흥민","축구");

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s1.name = "홍길동";
        s1.major = "컴퓨터공학과";
        s1.study();
        String eat = s1.eat("짜장면");
        System.out.println(s1.name+"학생이"+eat+"먹었다");


        s2.name = "김진아";
        s2.major = "건축학과";

        System.out.println(s1.name +s1.major);
        System.out.println(s2.name+s2.major);

        System.out.println(s3.name + s3.major+s3.eat("떡볶이"));
    }
}
