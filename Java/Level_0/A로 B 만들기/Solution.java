import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        
        int[] b_check = new int[26];
        int[] a_check = new int[26];
        
        for(int i = 0; i < before.length(); i++) {
            b_check[(int) before.charAt(i) - 97]++;
            a_check[(int) after.charAt(i) - 97]++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(b_check[i] != a_check[i]) { answer = 0; break; }
        }
        
        return answer;
    }
    
}