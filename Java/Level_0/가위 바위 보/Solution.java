class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        String temp = "";
        for(int i = 0; i < rsp.length(); i++) {
            temp = rsp.substring(i, i + 1);
            if(temp.equals("2")) answer += "0";
            if(temp.equals("0")) answer += "5";
            if(temp.equals("5")) answer += "2";
        }
        
        return answer;
    }
}