class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int min = 0; int max = 0;
        if(left <= right) { min = left; max = right; }
        else { min = right; max = left; }
        
        for(int i = min; i <= max; i++) {
            if(i % Math.sqrt(i) == 0) answer -= i;
            else answer += i;
        }
        
        return answer;
    }
}