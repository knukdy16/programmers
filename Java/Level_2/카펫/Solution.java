import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        int[] temp = new int[2];
        for(int i = 1; i <= Math.sqrt(yellow); i++) {
            if(yellow % i == 0) { temp[0] = yellow / i; temp[1] = i; }
            
            for(int j = 1; j <= Math.sqrt(brown + yellow); j++) {
                if((brown + yellow) % j == 0 && (brown + yellow) / j - 2 == temp[0] && (j - 2) == temp[1]) {
                    answer[0] = (brown + yellow) / j; answer[1] = j; break;
                }
            }
        }

        
        
        return answer;
    }
}