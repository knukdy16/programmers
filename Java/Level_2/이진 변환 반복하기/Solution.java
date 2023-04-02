class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        while(!s.equals("1")) {
            String temp = s.replaceAll("0", "");
            answer[1] += s.length() - temp.length();
            int c = temp.length(); s = "";
            while(c > 0) {
                if(c % 2 == 1) s = "1" + s;
                else s = "0" + s;
                c /= 2;
            }
            answer[0]++;
        }
        
        
        return answer;
    }
}