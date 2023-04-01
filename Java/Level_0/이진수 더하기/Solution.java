class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        
        int dec1 = 0;
        int dec2 = 0;
        
        for(int i = bin1.length(), bin = 1; i > 0; i--, bin *= 2) {
            dec1 += Integer.valueOf(bin1.substring(i - 1, i)) * bin;
        }
        
        for(int i = bin2.length(), bin = 1; i > 0; i--, bin *= 2) {
            dec2 += Integer.valueOf(bin2.substring(i - 1, i)) * bin;
        }
        
        int sum = dec1 + dec2;
        if(sum == 0) answer = "0";
        else {
            while(sum > 0) {
                answer = Integer.toString(sum % 2) + answer;
                sum /= 2;
            }
        }

        return answer;
    }
}