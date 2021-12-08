package lib;

public class Power {
    public long pow(long a, long b) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res *= a;
            }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}
