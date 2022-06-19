package PackAgeFirst;

/**
 * @Author : 墨宣
 * @Time : 2022/6/16 21:17
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

import static java.lang.Integer.MAX_VALUE;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean s = classOne.isHappy(n);
        scanner.close();
    }

    public boolean isHappy(int n) {
        boolean result = false;
        int t;
        int judge = 0;
        int j = 1000000000;
        while (true) {
            t = resolve(n);
            if (t == 1) {
                result = true;
                break;
            } else {
                n = t;
            }
            judge++;
            if (judge == j) {
                //j也可以是10
                break;
            }
        }
        return result;
    }

    public int resolve(int n) {
        int result = 0;
        while (n != 0) {
            result += (n % 10) * (n % 10);
            n /= 10;
        }
        return result;
    }
}
