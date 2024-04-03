import java.util.LinkedList;
import java.util.Queue;

public class StackQueue02 {

    static class Solution {
        public static int[] solution(int[] progresses, int[] speeds) {
            Queue<Integer> list = new LinkedList<Integer>();
            Queue<Integer> answerQueue = new LinkedList<Integer>();
            
            for (int i = 0; i < progresses.length; i++) {
                double days = (double)(100 - progresses[i]) / speeds[i];
                list.add((int)Math.ceil(days));
            }

            while (!list.isEmpty()) {
                int first = list.poll();
                int num = 1;
                while (!list.isEmpty() && first >= list.peek()) {
                    num++;
                    list.poll();
                }
                answerQueue.add(num);
            }

            int[] answer = new int[answerQueue.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = answerQueue.poll();
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        // 100 - 93 = 7 / 1 = 7
        // 100 - 30 = 70 / 30 3
        // 100 - 55 = 45 / 5 = 9
        int[] answer = (Solution.solution(progresses, speeds));
        for (int i : answer) {
            System.out.println(i);
        }
    }
}