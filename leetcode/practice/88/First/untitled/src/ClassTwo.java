/**
 * @Author : 墨宣
 * @Time : 2022/5/29 19:56
 * @File : ClassTwo
 * 任务 :
 */

import java.util.Arrays;
import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = scanner.nextInt();
        }
        int[] nums2 = new int[n];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i] = scanner.nextInt();
        }
        classTwo.resolve(nums1, m, nums2, n);
        scanner.close();
    }

    public void resolve(int[] nums1, int m, int[] nums2, int n) {
        if (m + n - m >= 0) {
            System.arraycopy(nums2, 0, nums1, m, m + n - m);
        }
        Arrays.sort(nums1);
        for (int i = 0; i < m + n; i++) {
            System.out.println(nums1[i]);
        }
    }
}
