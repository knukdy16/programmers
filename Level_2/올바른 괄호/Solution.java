class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int increase = -1;
        int[] count = { 0, 0 };
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ')' && increase < 0) { answer = false; break; }
            
            if(s.charAt(i) == '(') { increase++; count[0]++; }
            if(s.charAt(i) == ')') { increase--; count[1]++; }
        }
        
        if(count[0] != count[1]) answer = false;
        
        return answer;
    }
}