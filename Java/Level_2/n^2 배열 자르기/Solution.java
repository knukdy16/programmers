class Solution {
    public long[] solution(int n, long left, long right) {
        long[] answer = new long[(int) (right - left + 1)];
        
        long min = (left / n) + 1; long count = (left % n) + 1; long input;
        if(count <= min) input = min; else input = count;
        for(int i = 0; i < (int) (right - left + 1); i++) {
            answer[i] = input;
            
            if(count < n) { count++; if(input < count) input++; }
            else { count = 1; min++; input = min; }
        }
        
        return answer;
    }
}