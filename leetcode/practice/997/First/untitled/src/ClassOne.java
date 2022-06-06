/**
 * @Author : 墨宣
 * @Time : 2022/5/29 21:04
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] trust = new int[n][2];
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < 2; k++) {
                trust[j][k] = scanner.nextInt();
            }
        }
        System.out.println(classOne.resolve(n, trust));
    }

    public int resolve(int n, int[][] trust) {
        int result = -1;
        if (trust[trust.length - 1][0] == 0&&trust[trust.length - 2][0]!=0) {
            return n;
        }
        for (int j = 0; j < trust.length; j++) {
            int t = result;
            result = trust[j][0];
            if (t != result) {
                return -1;
            }
        }
        return result;
    }
}
