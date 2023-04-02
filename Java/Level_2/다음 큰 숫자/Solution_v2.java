class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] count = new int[2];
        
        count[0] = Integer.bitCount(n);
        
        while(count[0] != count[1]) {
            n++; count[1] = Integer.bitCount(n);
        }
        
        answer = n;
        
        return answer;
    }
}