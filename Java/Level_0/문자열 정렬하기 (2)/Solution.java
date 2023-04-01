import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        char strAry[] = new char[my_string.length()];
        char temp = 0;
        
        my_string = my_string.toLowerCase();
        for(int i = 0; i < my_string.length(); i++) { strAry[i] = my_string.charAt(i); }
        Arrays.sort(strAry);
        for(int i = 0; i < strAry.length; i++) { answer += Character.toString(strAry[i]); }
        
        return answer;
    }
}