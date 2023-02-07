class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] ary = s.split(" ");
        for(int i = 0; i < ary.length; i++) {
            answer += Integer.parseInt(ary[i]);
            if(i < (ary.length - 1) && ary[i + 1].equals("Z")) { answer -= Integer.parseInt(ary[i]); i++; }
        }
        return answer;
    }
}