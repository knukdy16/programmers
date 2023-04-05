class Solution {
    public long solution(int n) {
        long answer = 0;
        
        long a = 1; long b = 2;
        if(n < 3) answer = n;
        for(int i = 3; i <= n; i++) {
            answer = a % 1234567 + b % 1234567;
            a = b; b = answer;
        }
        
        return answer % 1234567;
    }
}