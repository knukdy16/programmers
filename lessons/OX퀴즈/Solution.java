class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i = 0; i < quiz.length; i++) {
            String[] str_temp = quiz[i].split(" ");
            int cal_temp = 0;
            if(str_temp[1].equals("+")) cal_temp = Integer.valueOf(str_temp[0]) + Integer.valueOf(str_temp[2]);
            if(str_temp[1].equals("-")) cal_temp = Integer.valueOf(str_temp[0]) - Integer.valueOf(str_temp[2]);
            answer[i] = (Integer.valueOf(str_temp[4]) == cal_temp ? "O" : "X");
        }
        
        return answer;
    }
}