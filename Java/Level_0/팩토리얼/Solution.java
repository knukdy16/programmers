class Solution {
    public int solution(int n) {
        int temp = 1;
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            temp *= i;
            if (temp > n) {
                answer = i - 1;
                break;
            } else if(temp == n) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}