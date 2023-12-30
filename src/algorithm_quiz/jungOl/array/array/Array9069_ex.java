package algorithm_quiz.jungOl.array.array;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Array9069_ex {
    public static void main(String[] args) throws DateTimeException {
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.print("YEAR = ");
            int year = sc.nextInt();
            System.out.print("MONTH = ");
            int month = sc.nextInt();


            if(month == 0){
                break;
            }

            if(month<1 || month >12) {
                System.out.println("잘못 입력하였습니다.\n");
                continue;
            }

            LocalDate day = LocalDate.of(year,month,1);
            int last = day.lengthOfMonth();

            System.out.printf("입력하신 달의 날 수는 %d일입니다.\n\n",last);

        }
    }
}
