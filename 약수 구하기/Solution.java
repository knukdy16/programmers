import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) temp.add(i);
        }
        
        int[] answer = temp.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}