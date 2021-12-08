import java.io.*;
import java.util.BitSet;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        FastWriter out = new FastWriter();
        long t = sc.nextLong();
        while (t-- > 0) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            long max = Long.MIN_VALUE;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    StringBuilder sb = new StringBuilder(s1);
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    System.out.println(Long.valueOf(sb.toString()));
                    max = Math.max(max, Long.valueOf(sb.toString()) ^ Long.valueOf(s2));
                }
            }
            for (int i = 0; i < s2.length(); i++) {
                for (int j = i + 1; j < s2.length(); j++) {
                    StringBuilder sb = new StringBuilder(s2);
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                    max = Math.max(max, Long.valueOf(sb.toString()) ^ Long.valueOf(s1));
                }
            }
            out.writeln(max);
        }
        out.flush();
    }

    // FastReader
    public static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
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
}