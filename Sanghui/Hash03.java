import java.util.HashMap;
/*
 * 접두가사 도대체 머임
 */

public class Hash03 {
    static class Solution {
        public static boolean solution(String[] phone_book) {
            boolean answer = true;

            String temp = "";
            HashMap<Integer, String> hashMap = new HashMap<>();

            for (int i = 0; i < phone_book.length - 1; i++) {
                if (phone_book[i].length() > phone_book[i + 1].length()) {
                    temp = phone_book[i];
                    phone_book[i] = phone_book[i + 1];
                    phone_book[i + 1] = temp;
                }
            }

            for (String string : phone_book) {
                System.out.println(string);
            }
            return answer;
        }
    }
    public static void main(String[] args) {
        String[] phone_booke = {"12","123","1235","567","88"};
        
        System.out.println(Solution.solution(phone_booke));
    }
}
