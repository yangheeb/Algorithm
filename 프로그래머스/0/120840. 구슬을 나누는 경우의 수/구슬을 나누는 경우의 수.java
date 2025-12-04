import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        BigInteger an1 = BigInteger.ONE;
        BigInteger an2 = BigInteger.ONE;
        BigInteger an3 = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            an1 = an1.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= share; i++) {
            an2 = an2.multiply(BigInteger.valueOf(i));
        }
        for (int i = 1; i <= balls - share; i++) {
            an3 = an3.multiply(BigInteger.valueOf(i));
        }

        BigInteger answer = an1.divide(an2.multiply(an3));
        return answer.intValue();
    }
}
