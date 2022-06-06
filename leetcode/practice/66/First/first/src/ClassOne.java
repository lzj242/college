/**
 * @Author : 墨宣
 * @Time : 2022/6/5 19:44
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] numm = new int[nums.length + 1];
        numm = classOne.resolve(nums);
        for (int i = 0; i < numm.length; i++) {
            System.out.println(numm[i]);
        }
        scanner.close();
    }

    public int[] resolve(int[] nums) {
        int[] numb = new int[nums.length + 1];
        System.arraycopy(nums, 0, numb, 1, nums.length);
        for (int i = numb.length - 1; i >= 0; i--) {
            if (numb[i] == 9) {
                numb[i] = 0;
            } else {
                numb[i] += 1;
                break;
            }
        }
        if (numb[0] == 0) {
            System.arraycopy(numb, 1, nums, 0, nums.length);
            return nums;
        }
        return numb;
    }
}
