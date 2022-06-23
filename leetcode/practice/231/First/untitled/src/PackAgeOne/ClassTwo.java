package PackAgeOne;

/**
 * @Author : 墨宣
 * @Time : 2022/6/19 16:38
 * @File : ClassTwo
 * 任务 :
 */

import java.util.*;

public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classTwo.resolve(n));
        scanner.close();
    }

    public boolean resolve(int n) {
        boolean result = false;
        if (n < 0) {
            return false;
        } else {
            for (int i = 0; i < 31; i++) {
                if (n == 1<<i) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}
