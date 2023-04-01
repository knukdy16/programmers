class Solution {
    public int[] solution(long n) {
        
        long temp = n;
        int size = 0;
        while(temp > 0) { temp /= 10; size++; }
        
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = (int) (n % 10); n /= 10;
        }
        
        return answer;
    }
}