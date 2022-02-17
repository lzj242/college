package PackAge;

/**
 * @Author 墨宣
 * @Date 2022/2/12 11:20
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt();
        int[][] nums = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                nums[j][k] = scanner.nextInt();
            }
        }
        System.out.println(classOne.resolve(nums));
    }

    public int resolve(int[][] grid) {
        int result = 0;
        for (int j = 0; j < grid.length; j++) {
            for (int k = 0; k < grid[j].length; k++) {
                if (grid[j][k] == 1) {
                    int t = 0;
                    while (true) {
                        if(j+t<grid.length&&k+
                        if (grid[j + t][t + k] == 1)
                    }
                }
            }
        }
        return result;
    }
}
