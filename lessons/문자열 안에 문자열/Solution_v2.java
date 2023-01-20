class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        for(int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i) == str2.charAt(0)) {
                int j;
                for(j = 1; j < str2.length() && (j + i) < str1.length(); j++) {
                    if(str1.charAt(i + j) != str2.charAt(j)) {
                        i += j - 1;
                        break;
                    }
                }
                if(j == str2.length()) answer = 1;
            }
        }
        
        return answer;
    }
}