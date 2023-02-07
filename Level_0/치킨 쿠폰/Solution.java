class Solution {
    public int solution(int chicken) {
        int answer = 0;

        int temp = chicken;
        int remain = 0;
        
        while(temp > 0) {
            answer += temp / 10;
            remain += temp % 10;
            temp /= 10;
            if(remain >= 10) {
                temp += remain;
                remain = 0;
            }
        }
        
        return answer;
    }
}