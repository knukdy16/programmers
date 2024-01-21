class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for(int i = 1; i <= number; i++) {
            int temp = cal_div(i);
            if(temp > limit) answer += power;
            else answer += temp;
        }
        
        return answer;
    }
    
    int cal_div(int n) {
        int count = 0;
        
        for (int i = 1; i * i <= n; i++) {
	        if (i * i == n) count++;
	        else if (n % i == 0) count += 2;
        }
        
        return count;
    }
}