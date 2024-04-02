import java.util.HashMap;

public class Hash04 {
    static class Solution {
        public static int solution(String[][] clothes) {
            int answer = 1;
            
            HashMap<String, Integer> hashMap = new HashMap<>();
            for (int i = 0; i < clothes.length; i++) {
                hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 1) + 1);
            }

            for (int value : hashMap.values()) {
                answer *= value;
            }

            return answer - 1;
        }
    }
    public static void main(String[] args) {
        String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
        
        System.out.println(Solution.solution(clothes));
    }
}
