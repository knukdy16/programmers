class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int c = gcd(a, b);
        b = b / c;
        
        int n = b;
        
        for(int i = 2; i <= n; i++) {
            while(b % i == 0) {
                b /= i; if(!(i == 2 || i == 5)) answer = 2;
            }
        }
        
        return answer;
    }
    
    
    public int gcd(int a, int b) {
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }
}