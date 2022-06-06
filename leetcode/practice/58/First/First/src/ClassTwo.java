/**
 * @Author : 墨宣
 * @Time : 2022/5/30 22:47
 * @File : ClassTwo
 * 任务 :
 */

import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {
        ClassTwo classTwo = new ClassTwo();
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(classTwo.resolve(s));
        scanner.close();
    }

    int resolve(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        int judge = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[chars.length - 1] == ' ') {
                if (chars[i] != ' ') {
                    judge++;
                }
                if (judge != 0) {
                    result++;
                }
                if (chars[i] == ' ' && judge != 0) {
                    break;
                }
            } else {
                if (chars[i] == ' ') {
                    break;
                } else {
                    result++;
                }
            }
        }
        return result-1;
    }
}
