public class Snippets {
  // Sort array before using
  private static int lowerBound(int[] a, int x) {
    int l = 0;
    int h = a.length; // Not n - 1
    while (l < h) {
      int mid = l + (h - l) / 2;
      if (x <= a[mid]) {
        h = mid;
      } else {
        l = mid + 1;
      }
    }
    return l;
  }

  // Sort array before using
  private static int upperBound(int[] a, int x) {
    int l = 0;
    int h = a.length; // Not n - 1
    while (l < h) {
      int mid = l + (h - l) / 2;
      if (x >= a[mid]) {
        l = mid + 1;
      } else {
        h = mid;
      }
    }
    return l;
  }
}
