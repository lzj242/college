package ChapterSeven;

/**
 * @Author 墨宣
 * @Date 2021/10/15 18:52
 * 目的：接收给定的一个整数（年龄），当年龄小于 18 岁或者大于 90 岁时，
 * 抛出一个异常（Exception）,提示“18岁以下，90岁以上的住客必须由亲友陪同”；当年龄处于 18 到 90 岁之间时，
 * 输出“欢迎入住本店”。
 */

import java.util.Scanner;

public class ClassNine {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n < 18 || n > 90) {
            throw new Exception("18岁以下，90岁以上的住客必须由亲友陪同");
        }
        System.out.println("欢迎入住本店");
    }
}
