/**
 * @Author : 墨宣
 * @Time : 2022/5/29 19:49
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
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
        classOne.resolve(nums1, m, nums2, n);
        scanner.close();
    }

    public void resolve(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < (Math.max(m, n)); i++) {
            if (i < (Math.min(m, n))) {
                list.add(nums1[i]);
                list.add(nums2[i]);
            } else {
                if (i >= m) {
                    list.add(nums2[i]);
                } else {
                    list.add(nums1[i]);
                }
            }
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            nums1[i] = list.get(i);
            System.out.println(nums1[i] + " ");
        }
    }
}