import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        int[] temp = new int[k];
        
        for(int i = 0; i < k; i++) temp[i] = -1;
        
        for(int i = 0; i < score.length; i++) {
            if(i < k) {
                temp[(k - 1) - i] = score[i];
                Arrays.sort(temp);
            }else if(temp[0] < score[i]) {
                temp[0] = score[i];
                Arrays.sort(temp);
            }
            
            if(i < k) answer[i] = temp[(k - 1) - i];
            else answer[i] = temp[0];
            
        }
        
        return answer;
    }
}