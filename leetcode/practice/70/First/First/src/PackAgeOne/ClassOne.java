package PackAgeOne;

import java.util.*;

/**
 * @Author : 墨宣
 * @Time : 2022/6/12 19:45
 * @File : ClassOne
 * 任务 :
 */
public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classOne.resolve(n));
        scanner.close();
    }

    public int resolve(int n) {
        int result = 1;
        int j = n / 2;
        for (int i = 1; i <= j; i++) {
            result += simple(n - i, n - (2 * i)) / fact(i);
        }
        return result;
    }

    public double fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    public double simple(int j, int k) {
        double result = 1;
        for (int i = k + 1; i <= j; i++) {
            result *= i;
        }
        return result;
    }
}
