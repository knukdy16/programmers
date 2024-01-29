import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        int count = 0;
        for(int i = score.length; i > 0; i -= m, count++) {
            if(i < m) break;   
        }
        
        Arrays.sort(score);
        
        for(int i = score.length - m; i >= 0; i -= m)
            answer += score[i] * m;
        
        return answer;
    }
}