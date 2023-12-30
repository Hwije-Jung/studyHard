package algorithm_quiz.zero_base;

import java.util.Random;

public class zero_6 {
    public static void main(String[] args) {

        Random r = new Random();
        int vote;
        int[] candidates = {0, 0, 0, 0};
        String name = " ";


        double progress = 0;

        for (int i = 1; i <= 10000; i++) {

            vote = r.nextInt(4) + 1;

            if (vote == 1) {
                candidates[0]++;
                name = "이재명";
            } else if (vote == 2) {
                candidates[1]++;
                name = "윤석열";
            } else if (vote == 3) {
                candidates[2]++;
                name = "심상정";
            } else {
                candidates[3]++;
                name = "안철수";
            }

            progress = (double) i / 10000;

            System.out.printf("[투표진행율]: %.2f%%, %d명 투표 => %s\n", progress * 100, i, name);
            System.out.printf("[기호:1] 이재명: %.2f%%, (투표수: %d)\n", candidates[0] / (double) i * 100, candidates[0]);
            System.out.printf("[기호:2] 윤석열: %.2f%%, (투표수: %d)\n", candidates[1] / (double) i * 100, candidates[1]);
            System.out.printf("[기호:3] 심상정: %.2f%%, (투표수: %d)\n", candidates[2] / (double) i * 100, candidates[2]);
            System.out.printf("[기호:4] 안철수: %.2f%%, (투표수: %d)\n", candidates[3] / (double) i * 100, candidates[3]);

            if(i == 10000) break;
            System.out.println();

        }
        int max = candidates[0];
        int president = 0;

        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] > max) {
                max = candidates[i];
                president = i;
            }
        }


        String presiName = " ";
        switch (president) {
            case 0 -> presiName = "이재명";
            case 1 -> presiName = "윤석열";
            case 2 -> presiName = "심상정";
            case 3 -> presiName = "안철수";
        }



        System.out.printf("[투표결과] 당선인: %s", presiName);


    }
}
