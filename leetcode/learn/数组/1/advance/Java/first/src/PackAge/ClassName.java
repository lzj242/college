package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/12 19:44
 * 目的：
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        Scanner scanner = new Scanner(System.in);
        int numsSize;
        int t;
        numsSize = scanner.nextInt();
        int[] nums = new int[numsSize];
        for (int i=0;i<numsSize;i++){
            nums[i]=scanner.nextInt();
        }
        t = className.removeDuplicates(nums);
        for (int i = 0; i < t; i++) {
            System.out.println(nums[i]);
        }
    }

   public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if (nums == null || nums.length == 0) {
            return 0;
        } else {
            int left = 0, right = 1;
            for (right = 1; right < nums.length; right++) {
                if (nums[left] != nums[right]) {
                    nums[++left] = nums[right];
                }
            }
            return ++left;
        }
    }
}
