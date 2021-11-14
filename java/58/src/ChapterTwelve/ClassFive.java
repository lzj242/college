package ChapterTwelve;

/**
 * @Author 墨宣
 * @Date 2021/10/17 15:53
 * 目的：统计给定单词中各字母的 ASCII 码值的和
 */

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class ClassFive {
    public static void main(String[] args) {
        String str;
        Scanner input = new Scanner(System.in);
        str = input.nextLine();
        int sum = 0;
        char[] sr = str.toCharArray();
        for (char st : sr) {
            sum += (int) st;
        }
        System.out.println(sum);
    }
}
