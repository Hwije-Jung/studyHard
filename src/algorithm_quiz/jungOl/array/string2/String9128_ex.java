package algorithm_quiz.jungOl.array.string2;

import java.util.Scanner;

public class String9128_ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String[] strArr1 = str1.split(" ");
        String[] strArr2 = str2.split(" ");





        int intSum = Integer.parseInt(strArr1[0])+Integer.parseInt(strArr1[1]);
        double doubleSum = Double.parseDouble(strArr2[0])+Double.parseDouble(strArr2[1]);

        System.out.printf("%s + %s = %d\n",strArr1[0],strArr1[1],intSum);
        System.out.printf("%.2f + %.2f = %.2f\n",Double.parseDouble(strArr2[0]),Double.parseDouble(strArr2[1]),doubleSum);
    }
}
