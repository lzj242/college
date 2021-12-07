package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/25 16:22
 * 目的：
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        int m, n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[] nums1 = new int[m];
        int[] nums2 = new int[n];
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            nums2[i] = scanner.nextInt();
        }
        System.out.printf("%.5f", className.resolve(nums1, nums2));
    }

    public double resolve(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0 && n != 0) {
            Arrays.sort(nums2);
            if (n % 2 == 0) {
                return ((nums2[n / 2] + nums2[n / 2 - 1]) / 2.0);
            } else {
                return (nums2[n / 2]);
            }
        } else if (m != 0 && n == 0) {
            Arrays.sort(nums1);
            if (m % 2 == 0) {
                return ((nums1[m / 2] + nums1[m / 2 - 1]) / 2.0);
            } else {
                return (nums1[m / 2]);
            }
        } else {
            int t = 0;
            int l = m + n;
            int[] nums3 = new int[nums1.length + nums2.length];
            for (int i = 0; i < l; i++) {
                if (i < m) {
                    nums3[i] = nums1[i];
                } else {
                    nums3[i] = nums2[t];
                    t++;
                }
            }
            Arrays.sort(nums3);
            if (l % 2 == 0) {
                return ((nums3[l / 2] + nums3[l / 2 - 1]) / 2.0);
            } else {
                return (nums3[l / 2]);
            }
        }
    }
}
