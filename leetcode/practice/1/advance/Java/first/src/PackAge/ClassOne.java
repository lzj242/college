package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/4 20:29
 * 目的：
 */

import java.util.HashMap;
import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int[] test = classOne.twoSum(num, target);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                result[0] = i;
                result[1] = hashMap.get(nums[i]);
                return new int[]{result[1], result[0]};
            }
            hashMap.put(target - nums[i], i);
        }
        return new int[0];
    }
}
