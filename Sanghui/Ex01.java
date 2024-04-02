import java.util.HashMap;

class Solution {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> map = new HashMap<>();
        
        for (String participantName : participant) {
            map.put(participantName, map.getOrDefault(participantName, 0) + 1);
        }

        for (String completionName : completion) {
            map.replace(completionName, map.get(completionName) - 1);
        }

        for (String name : map.keySet()) {
            if (map.get(name) != 0) {
                answer = name;
            }
        }
        return answer;

    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        
        System.out.println(solution(participant, completion)); // 결과: mislav
    }
}
