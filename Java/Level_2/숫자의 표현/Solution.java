class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int temp = 0;
        for(int i = 1; i <= n; i++) {
            temp = 0;
            for(int j = i; temp < n; j++) {
                temp += j;
            }
            if(temp == n) answer++;
        }
        
        return answer;
    }
}