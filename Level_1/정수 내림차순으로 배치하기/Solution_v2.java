import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String strAnswer = "";
        strAnswer = Long.toString(n);

        int[] ary = new int[strAnswer.length()];
        
        for(int i = 0; i < strAnswer.length(); i++) {
            ary[i] = Integer.valueOf(strAnswer.substring(i, i + 1));
        }
        
        Arrays.sort(ary);
        
        int mult = 1;
        for(int i = 0; i < ary.length; i++, mult *= 10) {
            answer += mult * (long) ary[i];
        }
        
        return answer;
    }
}