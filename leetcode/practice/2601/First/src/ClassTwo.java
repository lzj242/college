import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 墨宣
 * @Date 2022/5/11 20:53
 * @File : ClassTwo
 * 目的：
 */
public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[scanner.nextInt()];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        int[] result = classTwo.resolve(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] resolve(int[] nums) {
        int []result=new int[2];
        
        return result;
    }
}


