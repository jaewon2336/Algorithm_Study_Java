package ch01;

public class test01 {
    public static void main(String[] args) {
        int[] food = { 1, 3, 4, 6 };
        String answer = "";

        for (int i = 1; i < food.length; i++) {
            int temp = food[i] / 2; // i번 음식 개수
            for (int j = 0; j < temp; j++) {
                answer += i;
            }
        }

        answer += 0; // 물

        for (int i = food.length - 1; i > 0; i--) {
            int temp = food[i] / 2; // i번 음식 개수
            for (int j = 0; j < temp; j++) {
                answer += i;
            }
        }

        System.out.println(answer);
        // return answer;
    }
}
