import java.math.BigInteger;

class Solution {
    public BigInteger solution(int balls, int share) {
        BigInteger a = BigInteger.valueOf(1);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        BigInteger i;
        for(i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(balls)) != 1; i = i.add(BigInteger.ONE)) a = a.multiply(i);
        for(i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(share)) != 1; i = i.add(BigInteger.ONE)) b = b.multiply(i);
        for(i = BigInteger.valueOf(1); i.compareTo(BigInteger.valueOf(balls - share)) != 1; i = i.add(BigInteger.ONE)) c = c.multiply(i);
        return a.divide(b.multiply(c)); // (a / (b * c));
    }
}