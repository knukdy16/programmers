class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] ary = new int[10];
        for(int i = 0; i < numbers.length; i++) ary[numbers[i]]++;
        
        for(int i = 0; i < ary.length; i++) if(ary[i] == 0) answer += i;
        
        return answer;
    }
}