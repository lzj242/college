/**
 * @Author 墨宣
 * @Date 2022/5/11 18:26
 * @File : ClassOne
 * 目的：
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne ClassOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = ClassOne.resolve(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] resolve(int[] nums) {
        int[] result = new int[2];
        int[] test = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            test[i] = nums[i];
        }
        int[] test1 = new int[test.length];
        for (int i = 0; i < test.length; i++) {
            test1[i] = test[i];
        }
        Arrays.sort(nums);
        if (Arrays.equals(test, nums)) {
            result[0] = -1;
            result[1] = -1;
        } else {
            int min = test.length;
            for (int j = 0; j < test.length; j++) {
                for (int k = 1; k + j < test.length; k++) {
                    Arrays.sort(test, j, k + j + 1);
                    if (Arrays.equals(nums, test)) {
                        if (min > k) {
                            min = k;
                            result[0] = j;
                            result[1] = j + k;
                        }
                    }
                }
                for (int i = 0; i < test.length; i++) {
                    test[i] = test1[i];
                }
            }
        }
        return result;
    }
}
