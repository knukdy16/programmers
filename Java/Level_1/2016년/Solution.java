class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int count = 0;
        for(int i = 2; i <= a && i <= 8; i++) {
            if(i % 2 == 0 || i == 8) count += 31;
            else if(i == 3) count += 29;
            else count += 30;
        }
        
         for(int i = 9; i <= a && i <= 12; i++) {
            if(i % 2 == 0) count += 30;
            else count += 31;
        }
        
        count += b;
        
        if(count % 7 == 1) answer = "FRI";
        else if(count % 7 == 2) answer = "SAT";
        else if(count % 7 == 3) answer = "SUN";
        else if(count % 7 == 4) answer = "MON";
        else if(count % 7 == 5) answer = "TUE";
        else if(count % 7 == 6) answer = "WED";
        else if(count % 7 == 0) answer = "THU";
        
        return answer;
    }
}