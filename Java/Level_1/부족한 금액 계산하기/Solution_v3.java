class Solution {
    public long solution(long price, long money, long count) {
        
        money -= (count * (price + count * price)) / 2;     
        return money <= 0 ? -money : 0;
    
    }
}