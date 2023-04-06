import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        
        int[] ary = new int[citations[citations.length - 1] + 1];
        for(int i = 0; i < citations.length; i++) {
            for(int j = 0; j <= citations[i]; j++) ary[j]++;
        }
        
        for(int i = ary.length - 1; i > 0; i--) {
            if(ary[i] >= i) { answer = i; break; }
        }
        
        return answer;
    }
}