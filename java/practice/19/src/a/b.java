package a;
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        int n, i, j, k, t = 0;
        Scanner reader = new Scanner(System.in);
        n = reader.nextInt();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            a[i] = reader.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (k = 0; k < n; k++) {
                if (i != k) {
                    if (a[i] == a[k]) {
                        a[k] = -1;
                    }
                }
            }
        }
                for (k = 0; k < n; k++) {
                    if (a[k] == -1) {
                        continue;
                    }
                    else {
                        System.out.print(a[k]+"\t");
                    }
                }
            }
        }

