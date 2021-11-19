package ChapterTwelve;

/**
 * @Author 墨宣
 * @Date 2021/10/17 15:18
 * 目的：接收给定的字符串，判断是否为对称字符串。
 */

import java.util.Scanner;

public class ClassFour {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.next();
        StringBuffer str1 = new StringBuffer(str);
        if (str.equals(str1.reverse().toString())) {
            //如要比较，则转化为相同类型
            System.out.println(str + "是对称字符串");
        } else {
            System.out.println(str + "不是对称字符串");
        }

    }

}
