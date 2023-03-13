class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;

        long temp = 0;
        for(int i = 1; i <= count; i++) {
            temp += price;
            money -= temp;
        }
        
        if(money <= 0) answer = -money;
        
        return answer;
    }
}