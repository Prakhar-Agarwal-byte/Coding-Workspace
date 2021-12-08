import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Template {


    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();
        int N = sc.nextInt();
        out.writeln("In Template");
        out.flush();
    }
    // FastReader
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    // FastWriter
    public static class FastWriter {
        BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));
        public void writeln(Object i) throws IOException {
            log.write(i + "\n");
        }
        public void write(Object i) throws IOException {
            log.write((String) i);
        }
        public void flush() throws IOException {
            log.flush();
        }
    }
    // Sieve
    public static ArrayList<Integer> sieve(int n) {
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
    // GCD
    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a%b);
    }
    // pow
    public static long pow(long a, long b) {
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
    // MOD value
    static int MOD = 1000000007;
}
