package lib;

import java.util.ArrayList;
import java.util.Arrays;

public class Sieve {
    public ArrayList<Integer> sieve(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes, true);
        for (int i = 2; i*i <= n; i++) {
            if (primes[i]) {
                for (int j = i*i; j <= n; j += i) {
                    primes[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++) {
            if (primes[i]) {
                list.add(i);
            }
        }
        return list;
    }
}
