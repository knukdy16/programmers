import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        String strAnswer = Long.toString(n);
        long[] ary = new long[strAnswer.length()];
        
        for(int i = 0; i < strAnswer.length(); i++) {
            ary[i] = n % 10;
            n /= 10;
        }
        
        Arrays.sort(ary);
        
        long mult = 1;
        for(int i = 0; i < ary.length; i++, mult *= 10) {
            answer += mult * (long) ary[i];
        }
        
        System.out.println(answer);
        
        return answer;
    }
}