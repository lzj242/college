package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 17:09
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println(classOne.resolve(nums));
        scanner.close();
    }

    public int resolve(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[1], nums[0]);
        }
        int result_a = 0, result_b = 0, max_a = 0, max_b = 0;
        for (int t = 2; t < nums.length; t++) {
            for (int j = 0; j < nums.length; j += t) {
                max_a += nums[j];
            }
            result_a = Math.max(result_a, max_a);
            max_a = 0;
            for (int k = 1; k < nums.length; k += t) {
                max_b += nums[k];
            }
            result_b = Math.max(result_b, max_b);
            max_b = 0;
        }
        return Math.max(result_b, result_a);
    }
}
