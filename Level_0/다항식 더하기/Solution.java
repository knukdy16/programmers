class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int[] temp = new int[2];
        String[] splited = polynomial.split(" ");
        
        for(int i = 0; i < splited.length; i += 2) {
            if(splited[i].contains("x")) {
                if(splited[i].equals("x")) temp[0]++;
                else temp[0] += Integer.valueOf(splited[i].substring(0, splited[i].length() - 1));
            }
            else temp[1] += Integer.valueOf(splited[i]);
        }
        
        if(temp[0] == 0 && temp[1] == 0) answer = "0";
        else {
            if(temp[0] != 0) {
                if(temp[0] == 1) answer += "x";
                else answer += Integer.toString(temp[0]) + "x"; 
            }
            if(temp[0] != 0 && temp[1] != 0) answer += " + ";
            if(temp[1] != 0) answer += Integer.toString(temp[1]);
        }

        return answer;
    }
}