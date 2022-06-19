package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 15:55
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int[][] nums = new int[scanner.nextInt()][scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = scanner.nextInt();
            }
        }
        int[] test = new int[nums.length * nums[0].length];
        test = classOne.resolve(nums);
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }
        scanner.close();
    }

    public int[] resolve(int[][] nums) {
        int []test = new int[nums.length * nums.length];
        for (int j=0;j<nums.length; j++) {

        }
        return test;
    }
}
