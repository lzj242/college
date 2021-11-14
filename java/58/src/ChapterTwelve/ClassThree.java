package ChapterTwelve;

/**
 * @Author 墨宣
 * @Date 2021/10/17 14:31
 * 目的：接收两个字符串，统计第二个字符串在第一个字符串里出现的次数。
 * 输出样式：“出现的次数：x”。
 */

import java.util.Scanner;
public class ClassThree {
    public static void main(String[] args) {
        String str1;
        String str2;
        Scanner input = new Scanner(System.in);
        str1 = input.next();
        str2 = input.next();
        int i = 0;
        int d = 0;
        int n = 0;
        while ((d = (str1.indexOf(str2))) != -1) {
            d = str1.indexOf(str2);
            str1 = str1.substring(d + str2.length());
            //substring截取字符串
            i++;
        }
        System.out.println("出现的次数是：" + i);
    }
}
