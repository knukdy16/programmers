class Solution {
    public long solution(long price, long money, long count) {
        long answer = 0;

        long total =  (count * (price + count * price)) / 2;
        money -= total;
        
        if(money <= 0) answer = -money;
        
        return answer;
    }
}