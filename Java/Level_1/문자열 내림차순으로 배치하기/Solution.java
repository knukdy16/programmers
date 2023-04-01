class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] sort = s.toCharArray();
        
        for(int i = 0; i < sort.length; i++) {
            int index = i;
            for(int j = i + 1; j < sort.length; j++) {
                if(sort[index] < sort[j]) index = j;
            }
            
            char temp = sort[i];
            sort[i] = sort[index];
            sort[index] = temp;
        }
        
        for(int i = 0; i < sort.length; i++) answer += sort[i];
        
        return answer;
    }
}