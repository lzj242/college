package packageone;
/*
 * @Author : 墨宣
 * @Time : 2022/6/23 13:55
 * @File : ClassOne
 * 任务 :
 */

import java.util.*;

import static java.lang.System.in;

/**
 * @author feng
 */
public class ClassOne {
    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();
        Scanner scanner = new Scanner(in);
        String s = scanner.nextLine();
        String[] words = new String[scanner.nextInt()];
        for (int i = 0; i < words.length; i++) {
            words[i] = scanner.nextLine();
        }
        List<Integer> list = new ArrayList<>();
        list = classOne.findSubstring(s, words);
        for (Integer result : list) {
            System.out.print(result + " ");
        }
        scanner.close();
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        String str = "";
        for (int i = 0; i <)
            return result;
    }
}
