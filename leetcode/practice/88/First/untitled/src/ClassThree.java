/**
 * @Author : 墨宣
 * @Time : 2022/5/29 20:45
 * @File : ClassThree
 * 任务 :
 * @Author : 墨宣
 * @Time : 2022/5/29 19:56
 * @File : ClassThree
 * 任务 :
 */

import java.util.Scanner;

public class ClassThree {
    public static void main(String[] args) {
        ClassThree classthree = new ClassThree();
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
        classthree.resolve(nums1, m, nums2, n);
        scanner.close();
    }

    public void resolve(int[] nums1, int m, int[] nums2, int n) {

    }
}
