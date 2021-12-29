package ChapterOne;

/**
 * @Author 墨宣
 * @Date 2021/12/24 14:26
 * 目的：
 */

import java.util.Scanner;

public class ClassOne {
    enum Color {
        Red, Blue, Black;
    }
    public static void main(String[] args) {
        Color c = Color.Black;
        System.out.println(c);
        int 年龄 = 12;
        System.out.println(年龄);
        System.out.println(5 & -4);
    }
}