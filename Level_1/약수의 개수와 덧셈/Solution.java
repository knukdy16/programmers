class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        int min = 0; int max = 0;
        if(left <= right) { min = left; max = right; }
        else { min = right; max = left; }
        
        for(int i = min; i <= max; i++) {
            int temp = count(i);
            if(temp % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    
    public int count(int n) {
        int result = 0;
        for(int i = 1; i <= n; i++) { if(n % i == 0) result++; }
        return result;
    }
}