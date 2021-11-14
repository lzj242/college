package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/14 11:28
 * 目的：接收给定的一行字符串，实现以下需求：
 * 1.通过-切割字符串，得到一个字符串数组；
 * 2.将数组中每个元素转化为int类型，使用finally输出所有元素；
 * 3.捕获数据类型转换异常，当捕获到异常时，输出“元素x不能转换为整数”。
 * 字符串样式：98-32-java-hao-tian。
 * 切割后的字符串数组中的元素有些不由数字组成，当我们把这些元素转换为int类型时，会生成一个叫做数据类型转换的异常。
 * 程序功能示例：
 * 输入字符串：8-9-se-10
 * 输出样例：
 * 元素8
 * 元素9
 * 元素se不能转换为int类型
 * 元素se
 * 元素10
 */

import java.util.Scanner;

public class ClassFour {
    public static void main(String[] args) {
// 请在Begin-End间编写代码
/********** Begin **********/

// 第一步:创建ExcTest类
        Scanner input = new Scanner(System.in);
        String str;
        str = input.nextLine();
// 第二步：接收给定的字符串
        String[] sr = str.split("-");
// 第三步：切割字符串，得到一个数组
        for (String st : sr) {
            try {
                System.out.println("元素" + Integer.valueOf(st));
            } catch (Exception e) {
                System.out.println("元素" + st + "不能转换为int类型");
            }
        }
// 第四步：将数组中所有元素转化为int类型，并捕获异常

// 第五步：使用finally输出所有元素

/********** End **********/


    }
}
