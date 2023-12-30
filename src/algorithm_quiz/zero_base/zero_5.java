package algorithm_quiz.zero_base;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class zero_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        int month = 0;

        System.out.println("[달력 출력 프로그램]");
        System.out.println("달력의 년도를 입력해 주세요.(yyyy)");
        year = sc.nextInt();
        System.out.println("달력의 월을 입력해 주세요.(mm)");
        month = sc.nextInt();
        LocalDate day = LocalDate.of(year, month, 1); // 연,월,일 입력localdata 타입으로 변환

        DayOfWeek c = day.getDayOfWeek(); // day의 요일
        System.out.println(c);
        LocalDate endDay = LocalDate.of(year, (month ==12) ? 1: month+1, 1).minusDays(1);
        int lastDay = endDay.getDayOfMonth();
        System.out.println("loastday" + lastDay);

        int days = 0;
        if (c.toString().equals("SUNDAY")) days = 1;
        else if (c.toString().equals("MONDAY")) days = 2;
        else if (c.toString().equals("TUESDAY")) days = 3;
        else if (c.toString().equals("WEDNESDAY")) days = 4;
        else if (c.toString().equals("THURSDAY")) days = 5;
        else if (c.toString().equals("FRIDAY")) days = 6;
        else days = 7;

        int count = 1;

        System.out.println(days + "days");

        System.out.printf("[%d]년 %2d월]\n", year, month);
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = 0; i < days-1; i++) {
            System.out.printf("%2s\t","   ");
        }
        for (int i = days; i <= 7; i++) {
            System.out.printf("%02d\t", count++);
        }
        System.out.println();
        outer : for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("%02d\t", count++);
                if(count == lastDay+1) break outer ; // 마지막날을 출력한 후 +1이면 break;
            }
            System.out.println();
        }

    }
}
