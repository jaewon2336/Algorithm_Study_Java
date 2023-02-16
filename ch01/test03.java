package ch01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test03 {
    public static void main(String[] args) {
        int[] numList = { 10000, 20, 36, 47, 40, 6, 10, 7000 };
        int n = 30;

        HashMap<Integer, Integer> distanceMap = new HashMap<>();

        for (int i = 0; i < numList.length; i++) {
            int temp = n - numList[i];
            distanceMap.put(temp, numList[i]);
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(distanceMap.entrySet());

        // 키 리스트
        List<Integer> keys = new ArrayList<>();

        for (HashMap.Entry<Integer, Integer> entry : list) {
            keys.add(entry.getKey());
        }

        int temp;

        for (int i = 0; i < keys.size(); i++) {

            for (int j = 0; j < keys.size() - 1; j++) {
                int num1 = keys.get(j);
                int num2 = keys.get(j + 1);

                if (Math.abs(num1) > Math.abs(num2)) {
                    temp = num1;
                    keys.set(j, num2);
                    keys.set(j + 1, temp);
                } else if (Math.abs(num1) == Math.abs(num2)) {
                    if (num1 > num2) {
                        temp = num1;
                        keys.set(j, num2);
                        keys.set(j + 1, temp);
                    }
                }
            }
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            answer.add(distanceMap.get(keys.get(i)));
        }

        int[] answerReturn = answer.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(answerReturn.toString());
    }
}
