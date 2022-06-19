package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 16:33
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classOne.resolve(n));
        scanner.close();
    }

    public boolean resolve(int n) {
        boolean result = false;
        if (n < 0) {
            return false;
        } else {
            for (int i = 0; i < 31; i++) {
                if (n == (int) Math.pow(2, i)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
