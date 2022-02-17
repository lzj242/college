package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/11 17:04
 * 目的：
 */

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int k = scanner.nextInt();
        System.out.println(classOne.resolve(nums, k));
    }

    public int resolve(int[] nums, int k) {
        Arrays.sort(nums);
        int result = (int) Math.pow(10, 5);
        int judge = k - 1;
        for (int i = 0; i + judge < nums.length; i++) {
            result = Math.min(result, nums[i + judge] - nums[i]);
        }
        return result;
    }
}
