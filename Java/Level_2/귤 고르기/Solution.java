import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Arrays.sort(tangerine);
        System.out.println(tangerine[tangerine.length - 1]);
        int[] count = new int[tangerine[tangerine.length - 1] + 1];
        
        for(int i = 0; i < tangerine.length; i++) count[tangerine[i]]++;        
        
        Arrays.sort(count);
        
        int index = count.length - 1;
        while(k > 0) {
            k -= count[index]; answer++; index--;
        }
        
        return answer;
    }
}