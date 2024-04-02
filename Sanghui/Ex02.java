import java.util.*;

public class Ex02 {

    public static int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }

        int size = stack.size();
        int[] answer = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        for (int i : solution(arr)) {
            System.out.println(i);
        }
    }
}
