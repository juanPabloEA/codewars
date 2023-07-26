public class Xbonacci {

  public double[] tribonacci(double[] s, int n) {
    // hackonacci me
    double[] result = new double[n];
    if (n == 0) {
      return result;
    }
    for (int i = 0; i < n; i++) {
      if (i < 3) {
        result[i] = s[i];
      } else {
        result[i] = result[i - 1] + result[i - 2] + result[i - 3];
      }
    }
    return result;
  }
}