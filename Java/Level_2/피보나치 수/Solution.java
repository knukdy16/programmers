import java.math.BigInteger;

class Solution {
    public BigInteger solution(int n) {
        BigInteger[] fibonacci = {BigInteger.ZERO, BigInteger.ONE};
        for(int i = 2; i <= n; i++) {
            BigInteger temp = fibonacci[1];
            fibonacci[1] = fibonacci[0].add(fibonacci[1]);
            fibonacci[0] = temp;
        }
        
        return fibonacci[1].remainder(new BigInteger("1234567"));
    }
}