package ChapterThirteen;

/**
 * @Author 墨宣
 * @Date 2021/10/31 18:59
 * 目的：
 */

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassSix {
    public static void main(String[] args) {
        // 请在Begin-End间编写代码
        /********** Begin **********/
        // 接收给定的字符串
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
        str = str.replaceAll(" ", "");
        // 去除所有空格
        String regEx = "`";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        str = m.replaceAll("").trim();
        // 去除所有`
        str = str.replaceAll("[1-9][0-9]{4,}@qq.com", "90590@qq.com");
        // 替换邮箱
        System.out.println("清洗后的文本:" + str);
        // 输出清洗后的文本
        /********** End **********/
    }
}
