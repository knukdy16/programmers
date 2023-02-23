class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        long n = (long) Math.abs(a - b) + 1;
        
        answer = n * ((long) a + (long) b) / 2;
        
        return answer;
    }
}