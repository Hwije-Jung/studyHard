package javaStudy.day0;

public class AssignmentEx {
    public static void main(String[] args) {
        int result = 0;
        result += 10;
        result += result;

        System.out.println(result);
        result -= 5;
        System.out.println(result);
        result *= 5;
        System.out.println(result);

        int score = 80;
        String result2 = (score>=80) ? "pass":"fail";
        System.out.println(result2);

//        char grade = (score > 90) ? 'A' : ((score>80)?'B':())


    }
}
