class Solution {
    public int[] solution(int[] answers) {
        
        int[][] count = {{0, 1}, {0, 2}, {0, 3}};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for(int i = 0; i < answers.length; i++) {
            if(one[i % 5] == answers[i]) count[0][0]++;
            
            if(two[i % 8] == answers[i]) count[1][0]++;
            
            if(three[i % 10] == answers[i]) count[2][0]++;
        }
        
        
        for(int i = 0; i < 3; i++) {
            int max = count[i][0];
            int index = i;
            for(int j = i; j < 3; j++) {
                if(max < count[j][0]) { max = count[j][0]; index = j; }
            }
            
            int[] temp = count[i];
            count[i] = count[index];
            count[index] = temp;
        }
        
        int size = 1;
        for(int i = 1; i < 3; i++, size++) if(count[0][0] != count[i][0]) break;
        
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) answer[i] = count[i][1];
        
        return answer;
    }
}