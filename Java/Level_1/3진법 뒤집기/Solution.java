import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        List<Integer> ary = new ArrayList<Integer>();
        while(n > 0) {
            ary.add(n % 3); n /= 3;
        }
        
        for(int i = ary.size() - 1, mult = 1; i >= 0; i--, mult *= 3) {
            answer += (ary.get(i) * mult);
        }
        
        return answer;
    }
}