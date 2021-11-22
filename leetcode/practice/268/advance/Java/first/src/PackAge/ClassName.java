package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/7 20:37
 * 目的：
 */

import java.util.Scanner;
import java.util.HashSet;
public class ClassName {
    public static void main(String[] args) {
        ClassName className=new ClassName();
        int n,d;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scanner.nextInt();
        }
        d=className.resolve(nums);
        System.out.println(d);
    }
    int resolve(int []nums){
        HashSet<Integer> set = new HashSet<Integer>();
         for(int i = 0; i < nums.length; i++) {
             set.add(nums[i]);
         }
         for(int i = 0; i <= nums.length; i++) {
             if(!set.contains(i)) {
                 return i;
             }
         }
         return -1;
    }
}
