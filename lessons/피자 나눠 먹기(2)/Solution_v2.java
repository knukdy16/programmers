class Solution {
    public int solution(int n) {
        return LCM(n, 6) / 6;
    }
    
    public int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
    
    public int GCD(int a, int b){
        if(a % b == 0) return b;
        else return GCD(b, a % b);
    }
}