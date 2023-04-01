class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] ary = s.split(" ");
        String min = ary[0]; String max = ary[ary.length - 1];
        
        for(int i = 0; i < ary.length; i++) {
            if(Integer.valueOf(min) > Integer.valueOf(ary[i])) min = ary[i];
            if(Integer.valueOf(max) < Integer.valueOf(ary[i])) max = ary[i];
        }
        
        answer = min + " " + max;
        
        return answer;
    }
}