import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        
        List<Integer> ary = new ArrayList<Integer>();
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) ary.add(numlist[i]);
        }
        
        int[] answer = ary.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}