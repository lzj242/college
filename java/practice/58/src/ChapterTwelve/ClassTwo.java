package ChapterTwelve;

/**
 * @Author 墨宣
 * @Date 2021/10/17 13:44
 * 目的：接收给定的一个字符串，对该字符串做如下处理：
 * 1.去除前后空格
 * 2.找出字符串中以字母 a 开头，以字母 z 结尾以及含有 li 的单词（如：alsliz）；
 * 3.输出字符串中共有多少个满足上述条件的单词；
 * 4.将满足条件的单词分别转化为大写和小写输出。
 */

import java.util.Scanner;
import java.util.regex.*;

public class ClassTwo {
    public static void main(String[] args) {
        String str;
        int i = 0;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        String[] sr = str.split(",");
        //startswith只检测是否以该字符串作为前缀
        for (String st : sr) {
            st=st.trim();
            String regStr = "a.*z";

            Pattern pattern = Pattern.compile(regStr);
            Matcher matcher = pattern.matcher(st);

            boolean s1 = matcher.find();
            if (st.contains("li") && s1) {
                System.out.println("将符合条件的子字符串转化为小写：" + st.toLowerCase());
                System.out.println("将符合条件的子字符串转化为大写：" + st.toUpperCase());
                i++;
            }

        }
        if (i == 0) {
            System.out.println(str + "该字符串没有符合条件的子字符串");
        } else {
            System.out.println("字符串中共有符合条件的子字符串" + i + "个");
        }
    }
}
