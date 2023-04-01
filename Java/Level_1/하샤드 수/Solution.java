class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        int sum = 0;
        String converted = Integer.toString(x);
        
        for(int i = 0; i < converted.length(); i++) sum += Integer.valueOf(converted.substring(i, i + 1));
        
        System.out.println(sum);
        if(x % sum == 0) answer = true;
        
        return answer;
    }
}