/**
 * @Author : 墨宣
 * @Time : 2022/5/30 22:05
 * @File : ClassOne
 * 任务 :
 */

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(classOne.resolve(s));
        scanner.close();
    }

    public int resolve(String s) {
        int result = 0;
        String[] strs = s.split(" ");
        result = strs[strs.length - 1].length();
        return result;
    }
}
