class Solution {
    public int solution(String my_string) {
        String[] ary = my_string.split(" ");
        
        int answer = Integer.valueOf(ary[0]);
        
        for(int i = 1; i < ary.length; i += 2) {
            int temp = Integer.valueOf(ary[i + 1]);
            if(ary[i].equals("+")) answer += temp;
            if(ary[i].equals("-")) answer -= temp;
        }
        
        return answer;
    }
}