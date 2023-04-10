class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            char[] stack = new char[s.length()];
            int j = 0; int index = 0;
            for(j = 0; j < s.length(); j++) {
                if(j == 0 && (s.charAt(j) == ']' || s.charAt(j) == ')' || s.charAt(j) == '}')) {
                    break;
                }
                stack[index] = s.charAt(j);
                
                if(index > 0 && ((int) stack[index - 1] + 2 == (int) (stack[index]) 
                                 || (int) stack[index - 1] + 1 == (int) (stack[index]))) index--; 
                else index++;
                
            }
            if(j == s.length() && index == 0) answer++;
            
            s = s.substring(1, s.length()) + s.substring(0, 1);
        }

        return answer;
    }
}