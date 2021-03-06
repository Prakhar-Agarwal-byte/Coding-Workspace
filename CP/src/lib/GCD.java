package lib;

public class GCD {
    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
