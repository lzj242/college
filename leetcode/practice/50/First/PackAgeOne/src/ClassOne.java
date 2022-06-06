/**
 * @Author : 墨宣
 * @Time : 2022/6/4 19:53
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;

import static java.lang.Math.abs;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int y = scanner.nextInt();
        System.out.printf("%.5f", classOne.resolve(x, y));
    }

    public double resolve(double x, int y) {
        double result = 1;
        long t = y;
        t = Math.abs(t);
        if (y == 0) {
            return 1;
        }
        if (x == 1) {
            return 1;
        }
        if (x == -1) {
            if (t % 2 == 0) {
                return 1;
            } else {
                return -1;
            }
        }
        if (x == 2) {
            if (t < 31) {
                if (x == 2 && y > 0) {
                    return 1 << y;
                }
                if (x == 2 && y < 0) {
                    return 1.0 / (1 << t);
                }
            } else {
                return 0;
            }
        }
        if (x == -2) {
            if (t < 31) {
                if (x == -2 && y > 0) {
                    int s = 1 << y;
                    if (y % 2 == 0) {
                        return s;
                    } else {
                        return -s;
                    }
                }
                if (x == -2 && y < 0) {
                    int s = 1 << t;
                    if (t % 2 == 0) {
                        return 1.0 / s;
                    } else {
                        return -(1.0 / s);
                    }
                }
            } else {
                return 0;
            }
        } else {
            for (int i = 0; i < t; i++) {
                result *= x;
            }
        }

        if (y > 0) {
            return result;
        }
        return 1.0 / result;
    }
}
