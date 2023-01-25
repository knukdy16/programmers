class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i < n; i++) {
            int a = answer;
            answer++;
            
            if(answer % 3 == 0) {
                if(Integer.toString(answer + 1).contains("3")) answer += 2;
                else answer += 1;
            }
            
            while(Integer.toString(answer).contains("3")) {
                if((answer + 1) % 3 == 0) answer += 2;
                else answer += 1;
            }
        }
        
        return answer;
    }
}