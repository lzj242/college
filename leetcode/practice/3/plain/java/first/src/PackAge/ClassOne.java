package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/4 18:34
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = input.nextInt();
        }
        int target = input.nextInt();
        int[] test = classOne.twoSum(num, target);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+" ");
        }

    }

    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int j = 0; j < nums.length; j++) {
            for (int k = 0; k < nums.length; k++) {
                if (j != k) {
                    if (nums[j] + nums[k] == target) {
                        result[0] = nums[j];
                        result[1] = nums[k];
                        return new int[]{j, k};
                    }
                }
            }
        }
        return new int[0];
    }
}