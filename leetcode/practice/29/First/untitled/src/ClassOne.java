/**
 * @Author : 墨宣
 * @Time : 2022/6/1 19:54
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(classOne.resolve(m, n));
    }

    public int resolve(int m, int n) {
        if (m == 0) {
            return 0;
        }
        int judge = 1;
        if ((m > 0 && n < 0) || (m < 0 && n > 0)) {
            judge = -1;
        } else if ((m > 0 && n > 0) || (m < 0 && n < 0)) {
            judge = 1;
        }
        long j = m;
        long k = n;
        j = Math.abs(j);
        k = Math.abs(k);
        if (k == 1) {
            if ((judge * j) > MAX_VALUE || (judge * j) < MIN_VALUE) {
                return MAX_VALUE;
            }
            return (int) (judge * j);
        }
        long result = 0;
        long t = 0;
        while (true) {
            result++;
            t += k;
            if (t == j) {
                return (int) (judge * result);
            } else if (t > j) {
                return (int) (judge * (result - 1));
            }
            if (result > MAX_VALUE || result < MIN_VALUE) {
                return MAX_VALUE;
            }
            if (result > MAX_VALUE || result < MIN_VALUE) {
                break;
            }
        }
        return (int) (judge * result);
    }
}
