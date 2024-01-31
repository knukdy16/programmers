class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int a = 0; int b = 0;
        char temp = 0;
        for(int i = 0; i < s.length(); i++) {
            if(a == 0 && b == 0) { temp = s.charAt(i); a++; continue;} 
            if(temp == s.charAt(i)) a++; else b++;
            if(a == b) {a = 0; b = 0; answer++; }
        }
        if(a != b) answer++;
        
        return answer;
    }
}