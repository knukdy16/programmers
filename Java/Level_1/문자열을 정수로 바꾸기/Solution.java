class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int temp = 1;
        for(int i = s.length() - 1; i >= 0; i--, temp *= 10) {
            if(i == 0 && s.charAt(i) == '-') answer = -answer;
            else if(i == 0 && s.charAt(i) == '+') answer = +answer;
            else answer += Integer.valueOf(s.substring(i, i + 1)) * temp;
        }
        
        
        return answer;
    }
}