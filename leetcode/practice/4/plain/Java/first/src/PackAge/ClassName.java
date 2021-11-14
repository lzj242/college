package PackAge;

/**
 * @Author 墨宣
 * @Date 2021/11/7 19:21
 * 目的：
 */

import java.util.Arrays;
import java.util.Scanner;

public class ClassName {
    public static void main(String[] args) {
        ClassName className = new ClassName();
        int n, d;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i=0;i<n;i++){
            nums[i]= scanner.nextInt();
        }
        d = className.resolve(nums);
        System.out.println(d);
    }
    public int resolve(int[] a) {
        Arrays.sort(a);
        int t;
        for (int i = 0; i < a.length;i++) {
            if (i!=a[i]){
                t=i;
                return t;
            }
        }
        return a.length;
    }
}
