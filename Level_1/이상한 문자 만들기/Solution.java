class Solution {
    public String solution(String s) {
        String answer = "";
        
        int index = 0;
        for(int i = 0; i < s.length(); i++, index++) {
            if(s.charAt(i) == 32) { index = -1; answer += s.charAt(i); }
            else if(index % 2 == 0) answer += s.substring(i, i + 1).toUpperCase();
            else answer += s.substring(i, i + 1).toLowerCase();
        }
        
        return answer;
    }
}