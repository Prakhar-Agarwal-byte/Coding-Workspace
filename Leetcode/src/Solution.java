class Solution {
  public static void frequencyCount(int arr[], int N, int P) {
    int i = 0;
    while (i < N) {
      int e = arr[i] - 1;
      if (arr[i] <= 0) {
        i++;
        continue;
      } else {
        if (arr[e] <= 0) {
          arr[e]--;
          arr[i] = 0;
        } else {
          arr[i] = arr[e];
          arr[e] = -1;
        }
      }
    }
  }
}
