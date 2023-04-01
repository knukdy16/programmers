class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        String[] ary = s.split("");
        
        ary[0] = ary[0].toUpperCase(); answer += ary[0];
        for(int i = 1; i < ary.length; i++) {
            if(ary[i - 1].equals(" ")) ary[i] = ary[i].toUpperCase();
            answer += ary[i]; 
        }
        
        return answer;
    }
}