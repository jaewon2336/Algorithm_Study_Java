package ch01;

import java.util.ArrayList;
import java.util.List;

public class test02 {
    public static void main(String[] args) {

        int[] win_nums = { 38, 19, 20, 40, 10, 25 };
        int[] lottos = { 0, 0, 0, 0, 0, 0 };

        List<Integer> winNumList = new ArrayList<>();
        List<Integer> lottoList = new ArrayList<>();

        int minScore;
        int maxScore;
        int zeroCount = 0;
        int successCount = 0;

        // 정렬 및 리스트에 담기
        for (int i : win_nums) {
            winNumList.add(i);
        }

        for (int i : lottos) {
            lottoList.add(i);
            if (i == 0)
                zeroCount++; // 0 개수 체크
        }

        winNumList.sort(null);
        lottoList.sort(null);

        // 당첨 개수 확인
        for (int i = zeroCount; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (lottoList.get(i) == winNumList.get(j)) {
                    successCount++;
                }
            }
        }

        minScore = successCount;
        maxScore = successCount + zeroCount;

        int[] answer = { maxScore, minScore };

        for (int i = 0; i < answer.length; i++) {
            switch (answer[i]) {
                case 6:
                    answer[i] = 1;
                    break;
                case 5:
                    answer[i] = 2;
                    break;
                case 4:
                    answer[i] = 3;
                    break;
                case 3:
                    answer[i] = 4;
                    break;
                case 2:
                    answer[i] = 5;
                    break;
                default:
                    answer[i] = 6;
                    break;
            }
        }

        System.out.println(answer.toString());
    }
}
