class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        
        int denum = denum1 * num2 + denum2 * num1;
        int num = num1 * num2;
        
        int result = getGCD(denum, num);
        
        int[] answer = { denum / result, num / result };
        
        return answer;
    }
    
    public int getGCD(int num1, int num2) {
        if(num1 % num2 == 0) return num2;
        else return getGCD(num2, num1 % num2);
    }
}