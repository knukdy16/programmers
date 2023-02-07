import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        int length = 0;
        int[] answer;
        List<Integer> temp = new ArrayList<>();
        
        for(int i = 2; i <= n; i++) {
            if (n % i == 0) {
                n /= i;
                int j = 2;
                while(j <= i) {
                    if(i % j == 0) break;
                    j++;
                }
                if(j == i && !temp.contains(i)) temp.add(i);
            }
        }
        
        if(temp.size() == 0) temp.add(n);
        
        answer = temp.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}