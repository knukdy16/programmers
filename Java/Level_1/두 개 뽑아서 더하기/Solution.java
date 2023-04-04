import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        List<Integer> temp = new ArrayList<Integer>();
        
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                if(!temp.contains(numbers[i] + numbers[j])) temp.add(numbers[i] + numbers[j]);
            }
        }
        
        Collections.sort(temp);
        int[] answer = new int[temp.size()];
        for(int i = 0; i < answer.length; i++) answer[i] = temp.get(i);
        
        return answer;
    }
}