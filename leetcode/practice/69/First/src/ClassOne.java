/**
 * @Author 墨宣
 * @Date 2022/4/27 20:28
 * @File : ClassOne
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(classOne.resolve(n));
    }

    int resolve(int n) {
        for (int i = 0; i < 46342; i++) {
            long x = i * i, y = (i + 1) * (i + 1);
            System.out.println(x);
            System.out.println(y);
            if ((x <= (long)n) && (y > (long)n)) {
                return i;
            }
        }
        return 0;
    }
}