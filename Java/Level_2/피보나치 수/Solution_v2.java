class Solution {
    public long solution(int n) {
        long[] fibonacci = new long[2];
        fibonacci[0] = 0; fibonacci[1] = 1;
        for(int i = 2; i <= n; i++) {
            long temp = fibonacci[1];
            fibonacci[1] = (fibonacci[0] % 1234567) + (fibonacci[1] % 1234567);
            fibonacci[0] = temp % 1234567;
        }
        
        return fibonacci[1] % 1234567;
    }
}