package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/15 18:44
 * 目的：在主方法之外创建任意方法，通过英文逗号切割给定的一行字符串，得到一个字符串数组，输出数组中第五个元素，
 * 当切割后的数组长度小于 5 时，会产生数组越界异常，请将此异常抛出，在主方法中调用该方法，
 * 捕获异常，并输出“数组长度小于5”。
 */

import java.util.Scanner;

public class ClassEight {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        String[] sr = str.split(",");
        try {
            System.out.println(sr[4]);
        } catch (Exception e) {
            System.out.println("数组长度小于5");
        }
    }
}
