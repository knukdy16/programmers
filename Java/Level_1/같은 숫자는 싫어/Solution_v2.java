import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int temp = -1;
        
        ArrayList<Integer> answer_list = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(temp != arr[i]) { temp = arr[i]; answer_list.add(arr[i]); }
        }
        
        int[] answer = answer_list.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}