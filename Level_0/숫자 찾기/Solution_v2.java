class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        
        int index = 1;
        while(num > 0) {
            int temp = num % 10;
            if(temp == k) answer = index; 
            num /= 10;
            index++;
        }
        
        if(answer != -1) answer = index - answer;
        
        return answer;
    }
}