package a;
import java.util.Scanner;

/**
 * @author HUAWEI
 */
public class b {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int n, i;
    n = reader.nextInt();
    int[] a = new int[n];
    for (i = 0; i < n; i++) {
      a[i] = reader.nextInt();
    }
    for (i = 0; i < n; i++) {
      System.out.print(a[i]+"\t");
    }
  }
}
