class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int[] count = new int[2];
        
        int temp = n;
        while(temp > 0) { if(temp % 2 == 1) count[0]++; temp /= 2; }
        
        while(count[0] != count[1]) {
            count[1] = 0; n++; temp = n;
            while(temp > 0) { if(temp % 2 == 1) count[1]++; temp /= 2; }
        }
        
        answer = n;
        
        return answer;
    }
}