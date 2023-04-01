import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String strAnswer = "";
        strAnswer = Long.toString(n);

        int[] ary = new int[strAnswer.length()];
        
        for(int i = 0; i < strAnswer.length(); i++) {
            ary[i] = Integer.valueOf(strAnswer.substring(i, i + 1));
        }
        
        Arrays.sort(ary);
        
        strAnswer = "";
        for(int i = 0; i < ary.length; i++) {
            strAnswer = Integer.toString(ary[i]) + strAnswer;
        }
        
        return Long.valueOf(strAnswer);
    }
}