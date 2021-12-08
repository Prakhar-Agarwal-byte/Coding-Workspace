import java.util.*;

public class Template {
  private static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    int t = sc.nextInt();
    while (t-- > 0) {
      solve();
    }
  }

  private static void solve() {
    int n = sc.nextInt();
    int d = sc.nextInt();
    int idx = 0;
    boolean contains = false;
    String str = String.valueOf(n);
    if (d == 9) {
      for (int i = 0; i < str.length(); i++) {
        int ch = str.charAt(i) - '0';
        if (ch == 9) {
          contains = true;
          idx = i;
          break;
        } else if (ch == 8 && idx == -1) {
          idx = i;
        } else {
          idx = -1;
        }
      }
    } else {
      for (int i = 0; i < str.length(); i++) {
        int ch = str.charAt(i) - '0';
        if (ch == d) {
          contains = true;
          idx = i;
          break;
        }
      }
    }
    if (!contains) {
      System.out.println(0);
      return;
    }
    idx = str.length() - idx - 1;
    StringBuilder sb = new StringBuilder();
    if (idx == 0) {
      System.out.println(1);
      return;
    } else {
      int t = n;
      int carry = 0;
      for (int i = 0; i < idx; i++) {
        int dig = t % 10;
        t /= 10;
        int dig10 = 10 - carry - dig;
        carry = 1;
        sb.insert(0, dig10);
      }
      System.out.println(sb.toString());
      return;
    }
  }
}
